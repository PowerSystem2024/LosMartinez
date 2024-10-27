package com.mycompany.utn.steam.controller;

import com.mycompany.utn.steam.model.Filter;
import com.mycompany.utn.steam.model.Game;
import com.mycompany.utn.steam.service.GameService;
import com.mycompany.utn.steam.service.impl.GameServiceImpl;

import java.util.List;

public class GameController {
    private GameService gameService = new GameServiceImpl();

    public Game getGame(int id) {
        return gameService.getGameById(id);
    }

    public List<Game> getAllGames() {
        return gameService.getAllGames();
    }

    public void createGame(Game game) {
        gameService.saveGame(game);
    }

    public void updateGame(int id, Game gameDetails) {
        gameService.updateGame(id, gameDetails);
    }

    public void deleteGame(int id) {
        gameService.deleteGame(id);
    }
    
    public String[] getAllGameCategories() {
        return gameService.getAllGameCategories();
    }
    
    public void setFilter(Filter filter) {
        gameService.setFilter(filter);
    }
    
    public boolean hasFilter() {
        return gameService.hasFilter();
    }
}