package com.mycompany.utn.steam.service.impl;

import com.mycompany.utn.steam.controller.GameController;
import com.mycompany.utn.steam.model.Game;
import com.mycompany.utn.steam.service.GameService;
import com.mycompany.utn.steam.util.JsonDataLoader;
import com.mycompany.utn.steam.util.MenuDisplayer;
import java.util.Arrays;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

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
    
    @Override
    public void displayGame(Game game){
        String gameTitle = "ID " + game.getId() + " Titulo: " + game.getTitle();
        if(game.getIsFavourite()) {
            gameTitle = "*FAV* " + gameTitle;
        }
        
        MenuDisplayer.displayLine(gameTitle, true, true);
        MenuDisplayer.displayLine("Descripcion: " + game.getDesc(), false, false);
        MenuDisplayer.displayLine("", false, false);
        MenuDisplayer.displayLine("Fecha de Salida: " + game.getReleaseDate(), false, false);
        MenuDisplayer.displayLine("Categorias: [" + String.join("], [", game.getCategories()) + "]", false, false);
        
        if(game.getIsOwned()) {
            MenuDisplayer.displayLine("EN TU BIBLIOTECA", true, true);
        } else {
            MenuDisplayer.displayLine("Precio: $" + String.format("%.2f", game.getPrice()), true, true);
        }
        
        MenuDisplayer.displayLine("Anterior [A] - Proximo [P]", false, true);
    }
    
    @Override
    public Game newGameForm() {
        GameController gameController = new GameController();
        
        String title = MenuDisplayer.getStringInput("Titulo");
        String desc = MenuDisplayer.getStringInput("Descripcion");
        float price = MenuDisplayer.getFloatInput("Precio", Optional.of(0.0f), Optional.empty());
        String release_date = MenuDisplayer.getDateInput("Fecha de Lanzamiento");
        String[] categories = MenuDisplayer.getOptionsInput("Categorias", gameController.getAllGameCategories());
               
        return Game.createNewGame(title, desc, release_date, categories, price);
    }
}