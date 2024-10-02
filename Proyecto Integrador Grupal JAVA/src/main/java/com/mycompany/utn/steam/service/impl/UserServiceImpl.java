package com.mycompany.utn.steam.service.impl;

import com.mycompany.utn.steam.model.User;
import com.mycompany.utn.steam.service.UserService;
import com.mycompany.utn.steam.util.JsonDataLoader;

import java.util.List;

public class UserServiceImpl implements UserService {
    private List<User> users;

    public UserServiceImpl() {
        this.users = JsonDataLoader.loadUsers();
    }

    @Override
    public User getUserById(int id) {
        return users.stream()
                    .filter(user -> user.getId() == id)
                    .findFirst()
                    .orElse(null);
    }

    @Override
    public List<User> getAllUsers() {
        return users;
    }

    @Override
    public void saveUser(User user) {
        users.add(user);
    }
    
    @Override
    public void updateUser(int id, User updatedUser) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getId() == id) {
                users.set(i, updatedUser);
                return;
            }
        }
        throw new IllegalArgumentException("ERROR: User with id " + id + " not found");
    }
    
    @Override
    public void deleteUser(int id) {
        users.removeIf(user -> user.getId() == id);
    }
}