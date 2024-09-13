package com.mycompany.utn.steam.controller;

import com.mycompany.utn.steam.model.User;
import com.mycompany.utn.steam.service.UserService;
import com.mycompany.utn.steam.service.impl.UserServiceImpl;

import java.util.List;

public class UserController {
    private UserService userService = new UserServiceImpl();

    public User getUser(int id) {
        return userService.getUserById(id);
    }

    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    public void createUser(User user) {
        userService.saveUser(user);
    }

    public void deleteUser(int id) {
        userService.deleteUser(id);
    }
}