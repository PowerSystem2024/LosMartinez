package com.mycompany.utn.steam.service;

import com.mycompany.utn.steam.model.User;
import java.util.List;

public interface UserService {
    User getUserById(int id);
    List<User> getAllUsers();
    void saveUser(User user);
    void deleteUser(int id);
}