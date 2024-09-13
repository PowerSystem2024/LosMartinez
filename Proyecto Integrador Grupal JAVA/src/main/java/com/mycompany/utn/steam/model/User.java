package com.mycompany.utn.steam.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mycompany.utn.steam.controller.UserController;

import java.util.Comparator;
import java.util.Optional;

public class User {
    private int id;
    private String name;
    private String email;

    // Constructor
    @JsonCreator
    public User(@JsonProperty("id") int id, @JsonProperty("name") String name, @JsonProperty("email") String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public static User createNewUser(String name, String email) {
        UserController userController = new UserController();
        var users = userController.getAllUsers();
        Optional<User> maxIdUser = users.stream().max(Comparator.comparingInt(User::getId));
        
        int nextId = 1;
        if (maxIdUser.isPresent()) {
            int maxId = maxIdUser.get().getId();
            nextId = maxId + nextId;
        }
        
        return new User(nextId , name, email);
    }
    
    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}