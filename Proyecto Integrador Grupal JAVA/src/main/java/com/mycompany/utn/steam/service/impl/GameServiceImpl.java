package com.mycompany.utn.steam.service.impl;

import com.mycompany.utn.steam.model.Game;
import com.mycompany.utn.steam.service.GameService;
import com.mycompany.utn.steam.util.JsonDataLoader;
import java.util.Arrays;

import java.util.List;

public class GameServiceImpl implements GameService {
    private List<Game> games;

    public GameServiceImpl() {
        this.games = JsonDataLoader.loadGames();
    }

    @Override
    public Game getGameById(int id) {
        return games.stream()
                    .filter(game -> game.getId() == id)
                    .findFirst()
                    .orElse(null);
    }

    @Override
    public List<Game> getAllGames() {
        return games;
    }

    @Override
    public void saveGame(Game game) {
        games.add(game);
    }
    
    @Override
    public void updateGame(int id, Game updatedGame) {
        for (int i = 0; i < games.size(); i++) {
            if (games.get(i).getId() == id) {
                games.set(i, updatedGame);
                return;
            }
        }
        throw new IllegalArgumentException("ERROR: Game with id " + id + " not found");
    }

    @Override
    public void deleteGame(int id) {
        games.removeIf(game -> game.getId() == id);
    }
    
    @Override
    public String[] getAllGameCategories() {
        return games.stream()
                    .map(Game::getCategories)
                    .flatMap(Arrays::stream)
                    .distinct()
                    .toArray(String[]::new);
    }
}