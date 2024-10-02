package com.mycompany.utn.steam.proyect;

import com.mycompany.utn.steam.controller.GameController;
import com.mycompany.utn.steam.controller.UserController;
import com.mycompany.utn.steam.model.Game;
import com.mycompany.utn.steam.model.User;
import com.mycompany.utn.steam.service.impl.GameServiceImpl;
import com.mycompany.utn.steam.util.MenuDisplayer;
import java.util.Optional;
import java.util.Scanner;

public class UtnSteamProyect {
    public static void main(String[] args) {
//        displayHomeMenu();
//         displayAllUsersTest();
        displayAllGamesTest();
    }
    
    private static void displayHomeMenu(){
        Scanner scanner = new Scanner(System.in);
        
        int option = -1;
        while (option != 4) {
            MenuDisplayer.displayMenu("store");
            try {
                option = Integer.parseInt(scanner.nextLine());

                switch (option) {
                    case 1:
                        System.out.println("Has seleccionado la Opcion 1");
                        break;
                    case 2:
                        System.out.println("Has seleccionado la Opcion 2");
                        break;
                    case 3:
                        System.out.println("Has seleccionado la Opcion 3");
                        break;
                    case 4:
                        System.out.println("Saliendo...");
                        break;
                    default:
                        System.out.println("Opción no valida, por favor intente de nuevo.");
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada no valida, por favor ingrese un numero.");
            }
        }
        
        scanner.close();
    }
    
    private static void displayAllUsersTest(){
        // Iniciamos el UserController
        UserController userController = new UserController();
        
        // Como ejemplo de uso hago newUser y creo un User nuevo y lo guardo
        var newUser = User.createNewUser("Pepe", "pepe@pepe.com");
        userController.createUser(newUser);
        
        // Busco todos los usuarios
        var users = userController.getAllUsers();
        
        // Hago un foreach y lo muestro
        for (User user : users) {
            MenuDisplayer.displayLine(user.getId()+"", false, false);
            MenuDisplayer.displayLine(user.getName(), false, false);
            MenuDisplayer.displayLine(user.getEmail(), false, true);
        }
    }
    
        
    private static void displayAllGamesTest(){
        Scanner scanner = new Scanner(System.in);
        GameController gameController = new GameController();
        
        var games = gameController.getAllGames();
        String option = "";
        int index = 0;
        
        while (option != "4") {  
            Game game = games.get(index);
            displayGame(game);
            MenuDisplayer.displayMenu("game-list");
            try {
                option = scanner.nextLine();

                switch (option) {
                    case "1":
                        System.out.println("Has agregado " + game.getTitle() + " a tus juegos");
                        scanner.nextLine();
                        break;
                    case "2":
                        System.out.println("Has agregado " + game.getTitle() + " a tu lista de deseados");
                        scanner.nextLine();
                        break;
                    case "3":
                        System.out.println("Has agregado " + game.getTitle() + " a tu lista de ignorados");
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
                        System.out.println("Editando Juego");
                        newGameForm();
                        scanner.nextLine();
                        option = "4";
                        break;
                    case "5":
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
    
    private static void displayGame(Game game){
        MenuDisplayer.displayLine("Titulo: " + game.getTitle(), true, true);
        MenuDisplayer.displayLine("Descripcion: " + game.getDesc(), false, false);
        MenuDisplayer.displayLine("", false, false);
        MenuDisplayer.displayLine("Fecha de Salida: " + game.getReleaseDate(), false, false);
        MenuDisplayer.displayLine("Categorias: [" + String.join("], [", game.getCategories()) + "]", false, false);
        MenuDisplayer.displayLine("Precio: $" + String.format("%.2f", game.getPrice()), true, true);
        MenuDisplayer.displayLine("Anterior [A] - Proximo [P]", false, true);
    }
    
    private static void newGameForm() {
        GameController gameController = new GameController();
        
//        String title = MenuDisplayer.getStringInput("Titulo");
//        String desc = MenuDisplayer.getStringInput("Descripcion");
//        float price = MenuDisplayer.getFloatInput("Precio", Optional.of(0.0f), Optional.empty());
//        String release_date = MenuDisplayer.getDateInput("Fecha de Lanzamiento");
        String[] categories = MenuDisplayer.getOptionsInput("Categorias", gameController.getAllGameCategories());
    }
}
