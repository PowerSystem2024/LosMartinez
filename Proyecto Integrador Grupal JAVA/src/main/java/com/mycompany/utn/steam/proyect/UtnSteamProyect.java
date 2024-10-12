package com.mycompany.utn.steam.proyect;

import com.mycompany.utn.steam.controller.GameController;

import com.mycompany.utn.steam.model.Game;

import com.mycompany.utn.steam.service.GameService;
import com.mycompany.utn.steam.service.impl.GameServiceImpl;

import com.mycompany.utn.steam.util.MenuDisplayer;
import java.util.List;

import java.util.Scanner;

public class UtnSteamProyect {
    Scanner scanner;
    GameController gameController;
    GameService gameService;
       
    public static void main(String[] args) {
        UtnSteamProyect proyect = new UtnSteamProyect();
        
        proyect.scanner = new Scanner(System.in);
        proyect.gameController = new GameController();
        proyect.gameService = new GameServiceImpl();
        
        proyect.displayHomeMenu();
    }
    
    private void displayHomeMenu(){
        int option = -1;
        while (option != 4) {
            MenuDisplayer.displayMenu("store");
            try {
                option = Integer.parseInt(scanner.nextLine());

                switch (option) {
                    case 1:
                        System.out.println("Ingresando a la tienda");
                        displayAllGames();
                        break;
                    case 2:
                        System.out.println("Ingresando a mis Juegos");
                        break;
                    case 3:
                        System.out.println("Creando nuevo juego");
                        createNewGame();
                        break;
                    case 4:
                        System.out.println("Saliendo...");
                        break;                
                    default:
                        System.out.println("ERROR: Opción no valida, por favor intente de nuevo.");
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("ERROR: Entrada no valida, por favor ingrese un numero.");
            }
        }
        
        scanner.close();
    }
    
    private void createNewGame(){
        boolean createGame = false;
        do {
            System.out.println("Ingrese los datos para el Nuevo Juego");
            Game newGame = gameService.newGameForm();          

            gameService.displayGame(newGame);

            createGame = MenuDisplayer.getConfirmationInput("Esta correcta la data del Juego?");

            if (createGame) {
                gameController.createGame(newGame);
                System.out.println(newGame.getTitle() + " se agrego al listado de juegos");
            } else {
                if (!MenuDisplayer.getConfirmationInput("Desea volver a cargar la data?")) {
                    System.out.println("El juego no fue creado, volviendo al menu principal");
                    break;
                }
            }
        } while (!createGame);
        scanner.nextLine();
    }
    
    private void displayAllGames(){
        List<Game> games = gameController.getAllGames();
        String option = "";
        boolean exit = false;
        int index = 0;
        
        while (!exit) {  
            Game game = games.get(index);
            gameService.displayGame(game);
            MenuDisplayer.displayMenu("game-list");
            try {
                option = scanner.nextLine();

                switch (option) {
                    case "1":
                        game.setIsOwned(!game.getIsOwned());
                        System.out.println("Has agregado " + game.getTitle() + " a tus juegos");
                        scanner.nextLine();
                        break;
                    case "2":
                        game.setIsFavourite(!game.getIsFavourite());
                        System.out.println("Has agregado " + game.getTitle() + " a tu lista de favoritos");
                        scanner.nextLine();
                        break;
                    case "3":
                        System.out.println("Has agregado " + game.getTitle() + " a tu lista de ignorados y no volvera a aparecer");
                        scanner.nextLine();
                        break;
                    case "p":
                    case "P":
                        if(index == games.size() - 1){
                          index = 0;
                        } else {
                          index++;
                        }
                        System.out.println("Proximo Juego");
                        break;
                    case "a":
                    case "A":
                        if(index > 0){
                          index--;
                        } else {
                          index = games.size() - 1;
                        }
                        System.out.println("Anterior Juego");
                        break;
                    case "4":
                        exit = true;
                        System.out.println("Volviendo...");
                        break;
                    default:
                        System.out.println("Opción no valida, por favor intente de nuevo.");
                        scanner.nextLine();
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada no valida, por favor ingrese un numero.");
            }
            System.out.println();
        }
    }
}
