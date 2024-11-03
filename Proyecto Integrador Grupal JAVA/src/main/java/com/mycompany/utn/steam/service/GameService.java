package com.mycompany.utn.steam.service;

import com.mycompany.utn.steam.model.Filter;
import com.mycompany.utn.steam.model.Game;
import java.util.List;

public interface GameService {
    Game getGameById(int id);
    List<Game> getAllGames();
    void saveGame(Game game);
    void updateGame(int id, Game game);
    void deleteGame(int id);
    String[] getAllGameCategories();
    void displayGame(Game game, Boolean withNavigation);
    void displayFilter(Filter filter);
    Game newGameForm();
    Filter newFilterForm();
    void setFilter(Filter newFilter);
    boolean hasFilter();
}