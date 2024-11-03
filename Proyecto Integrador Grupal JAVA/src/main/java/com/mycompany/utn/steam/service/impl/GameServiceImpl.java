package com.mycompany.utn.steam.service.impl;

import com.mycompany.utn.steam.controller.GameController;
import com.mycompany.utn.steam.model.Filter;
import com.mycompany.utn.steam.model.Game;
import com.mycompany.utn.steam.service.GameService;
import com.mycompany.utn.steam.util.JsonDataLoader;
import com.mycompany.utn.steam.util.MenuDisplayer;
import java.util.Arrays;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class GameServiceImpl implements GameService {
    private List<Game> games;
    private Filter filter;
    private boolean hasFilter;

    public GameServiceImpl() {
        games = JsonDataLoader.loadGames();
        filter = null;
        hasFilter = false;
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
        if (hasFilter) {
            return filterGames();
        } else {
            return games;
        }
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
    public void displayGame(Game game, Boolean withNavigation){
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
        
        if (withNavigation) {
            MenuDisplayer.displayLine("Anterior [A] - Proximo [P]", false, true);
        }        
    }

    
    @Override
    public void displayFilter(Filter filter){
        GameController gameController = new GameController();
        
        List<Game> games = getAllGames();
        
        MenuDisplayer.displayLine("Filter", true, true);
        if (filter.getTitle() != null) {
            MenuDisplayer.displayLine("Titulo: Contiene '" + filter.getTitle() + "'", false, false);
        }
        if (filter.getReleaseDateBefore() != null && filter.getReleaseDateAfter() != null) {
            MenuDisplayer.displayLine("Fecha de Salida: Desde " + filter.getReleaseDateBefore() + " hasta " + filter.getReleaseDateAfter(), false, false);
        }
        if (filter.getCategories() != null) {
            MenuDisplayer.displayLine("Categorias: [" + String.join("], [", filter.getCategories()) + "]", false, false) ;
        }
        if (filter.getPriceMin() != null && filter.getPriceMax() != null) {
            MenuDisplayer.displayLine("Precio: Min " + filter.getPriceMin() + " - Max " + filter.getPriceMax(), false, false);
        }
        if (filter.isOwned() != null) {
            MenuDisplayer.displayLine("Comprado: " + filter.isOwned(), false, false);
        }
        if (filter.isFavourite() != null) {
            MenuDisplayer.displayLine("Favorito: " + filter.isFavourite(), false, false);
        }
        MenuDisplayer.displayLine("Juegos Encontrados: " + getFilteredGameCount(games, filter), false, true);
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
    
    @Override
    public Filter newFilterForm() {
        GameController gameController = new GameController();
        
        List<Game> games = getAllGames();

        String title = null;
        String releaseDateBefore = null;
        String releaseDateAfter = null;
        String[] categories = null;
        Float priceMin = null;
        Float priceMax = null;
        Boolean owned = null;
        Boolean favourite = null;
        
        Filter filter = new Filter(title, releaseDateBefore, releaseDateAfter, categories, 
                               priceMin, priceMax, owned, favourite);

        if (MenuDisplayer.getConfirmationInput("Filtrar por titulo?")) {
            title = MenuDisplayer.getStringInput("Titulo del juego");
            filter.setTitle(title);
            System.out.println("Juegos encontrados: " + getFilteredGameCount(games, filter));
        }

        if (MenuDisplayer.getConfirmationInput("Filtrar por fecha de lanzamiento?")) {
            releaseDateAfter = MenuDisplayer.getDateInput("Fecha de lanzamiento despues de");
            releaseDateBefore = MenuDisplayer.getDateInput("Fecha de lanzamiento antes de");
            filter.setReleaseDateAfter(releaseDateAfter);
            filter.setReleaseDateBefore(releaseDateBefore);
            System.out.println("Juegos encontrados: " + getFilteredGameCount(games, filter));
        }

        if (MenuDisplayer.getConfirmationInput("Filtrar por categorias?")) {
            categories = MenuDisplayer.getOptionsInput("Categorias del juego (elige una o mas)",  gameController.getAllGameCategories());
            filter.setCategories(categories);
            System.out.println("Juegos encontrados: " + getFilteredGameCount(games, filter));
        }

        if (MenuDisplayer.getConfirmationInput("Filtrar por precio?")) {
            priceMin = MenuDisplayer.getFloatInput("Precio minimo", Optional.of(0.0f), Optional.empty());
            priceMax = MenuDisplayer.getFloatInput("Precio maximo", Optional.of(0.0f), Optional.empty());
            filter.setPriceMin(priceMin);
            filter.setPriceMax(priceMax);
            System.out.println("Juegos encontrados: " + getFilteredGameCount(games, filter));
        }

        if (MenuDisplayer.getConfirmationInput("Filtrar por comprado (si ya esta en tu biblioteca)?")) {
            owned = MenuDisplayer.getConfirmationInput("Esta comprado?");
            filter.setOwned(owned);
            System.out.println("Juegos encontrados: " + getFilteredGameCount(games, filter));
        }

        if (MenuDisplayer.getConfirmationInput("Filtrar por favorito?")) {
            favourite = MenuDisplayer.getConfirmationInput("Es favorito?");
            filter.setFavourite(favourite);
            System.out.println("Juegos encontrados: " + getFilteredGameCount(games, filter));
        }

        return new Filter(title, releaseDateBefore, releaseDateAfter, categories, priceMin, priceMax, owned, favourite);
    }
    
    @Override
    public void setFilter(Filter newFilter) {
        if (newFilter != null) {
            filter = newFilter;
            hasFilter = true;
        } else {
            filter = null;
            hasFilter = false;
        }       
    }
    
    @Override
    public boolean hasFilter() {
        return hasFilter;
    }
            
    private int getFilteredGameCount(List<Game> games, Filter filter) {
        return (int) games.stream()
            .filter(game -> filter.getTitle() == null || game.getTitle().contains(filter.getTitle()))
            .filter(game -> filter.getReleaseDateBefore() == null || game.getReleaseDate().compareTo(filter.getReleaseDateBefore()) < 0)
            .filter(game -> filter.getReleaseDateAfter() == null || game.getReleaseDate().compareTo(filter.getReleaseDateAfter()) > 0)
            .filter(game -> filter.getCategories() == null || Arrays.stream(filter.getCategories()).anyMatch(category -> Arrays.asList(game.getCategories()).contains(category)))
            .filter(game -> filter.getPriceMin() == null || game.getPrice() >= filter.getPriceMin())
            .filter(game -> filter.getPriceMax() == null || game.getPrice() <= filter.getPriceMax())
            .filter(game -> filter.isOwned() == null || filter.isOwned() == game.getIsOwned())
            .filter(game -> filter.isFavourite() == null || filter.isFavourite() == game.getIsFavourite())
            .count();
    }
    
    private List<Game> filterGames() {
        return games.stream()
            .filter(game -> filter.getTitle() == null || game.getTitle().contains(filter.getTitle()))
            .filter(game -> filter.getReleaseDateBefore() == null || game.getReleaseDate().compareTo(filter.getReleaseDateBefore()) < 0)
            .filter(game -> filter.getReleaseDateAfter() == null || game.getReleaseDate().compareTo(filter.getReleaseDateAfter()) > 0)
            .filter(game -> filter.getCategories() == null || Arrays.stream(filter.getCategories()).anyMatch(category -> Arrays.asList(game.getCategories()).contains(category)))
            .filter(game -> filter.getPriceMin() == null || filter.getPriceMin() <= 0 || game.getPrice() >= filter.getPriceMin())
            .filter(game -> filter.getPriceMax() == null || filter.getPriceMax() <= 0 || game.getPrice() <= filter.getPriceMax())
            .filter(game -> filter.isOwned() == null || filter.isOwned() == game.getIsOwned())
            .filter(game -> filter.isFavourite() == null || filter.isFavourite() == game.getIsFavourite())
            .collect(Collectors.toList());
    }
}