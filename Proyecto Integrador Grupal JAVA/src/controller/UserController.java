package controller;

import model.User;
import service.UserService;
import service.impl.UserServiceImpl;

import java.util.List;

public class UserController {
    private UserService userService = new UserServiceImpl();

    public User getUser(Long id) {
        return userService.getUserById(id);
    }

    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    public void createUser(User user) {
        userService.saveUser(user);
    }

    public void deleteUser(Long id) {
        userService.deleteUser(id);
    }
}