package com.mycompany.utn.steam.repository;

import com.mycompany.utn.steam.model.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository {
    Optional<User> findById(int id);
    List<User> findAll();
    void save(User user);
    void deleteById(int id);
}