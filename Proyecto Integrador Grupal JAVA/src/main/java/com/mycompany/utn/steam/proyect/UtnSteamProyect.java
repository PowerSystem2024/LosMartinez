package com.mycompany.utn.steam.proyect;

import com.mycompany.utn.steam.model.User;
import com.mycompany.utn.steam.service.impl.UserServiceImpl;

public class UtnSteamProyect {
    public static void main(String[] args) {
        // Iniciamos el userService
        UserServiceImpl userService = new UserServiceImpl();
        
        // Como ejemplo de uso hago newUser y creo un User nuevo y lo guardo
        var newUser = User.createUser("Pepe", "pepe@pepe.com");
        userService.saveUser(newUser);
        
        // Busco todos los usuarios
        var users = userService.getAllUsers();
        
        // Hago un foreach y lo muestro
        for (User user : users) {
            System.out.println(user.getId());
            System.out.println(user.getName());
            System.out.println(user.getEmail());
            System.out.println("----------------");
        }
    }
}
