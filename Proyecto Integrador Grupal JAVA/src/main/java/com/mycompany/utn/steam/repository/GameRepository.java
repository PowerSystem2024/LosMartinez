package com.mycompany.utn.steam.repository;

import com.mycompany.utn.steam.model.Game;

import java.util.List;
import java.util.Optional;

public interface GameRepository {
    Optional<Game> findById(int id);
    List<Game> findAll();
    void save(Game game);
    void deleteById(int id);
    String[] getAllGameCategories();
}