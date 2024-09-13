package com.mycompany.utn.steam.proyect;

import com.mycompany.utn.steam.controller.UserController;
import com.mycompany.utn.steam.model.User;
import com.mycompany.utn.steam.service.impl.UserServiceImpl;
import com.mycompany.utn.steam.util.MenuDisplayer;
import java.util.Scanner;

public class UtnSteamProyect {
    public static void main(String[] args) {
        displayHomeMenu();
//         displayAllUsersTest();
    }
    
    private static void displayHomeMenu(){
        Scanner scanner = new Scanner(System.in);
        MenuDisplayer.displayMenu("store");
        
        int option = -1;
        while (option != 4) {    
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
}
