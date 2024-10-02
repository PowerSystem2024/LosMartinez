package com.mycompany.utn.steam.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mycompany.utn.steam.controller.GameController;
import java.util.Comparator;
import java.util.Optional;

public class Game {
    private int id;
    private String title;
    private String desc;
    private String release_date;
    private String[] categories;
    private float price;

    // Constructor, getters y setters
    @JsonCreator
    public Game(@JsonProperty("id") int id, @JsonProperty("title") String title, 
                @JsonProperty("desc") String desc, @JsonProperty("release_date") String release_date, 
                @JsonProperty("categories") String[] categories,  @JsonProperty("price") float price) {
        this.id = id;
        this.title = title;
        this.desc = desc;
        this.release_date = release_date;
        this.categories = categories;
        this.price = price;
    }

    public static Game createNewGame(String title, String desc, String release_date, String[] categories, float price) {
        GameController gameController = new GameController();
        var games = gameController.getAllGames();
        Optional<Game> maxIdGame = games.stream().max(Comparator.comparingInt(Game::getId));
        
        int nextId = 1;
        if (maxIdGame.isPresent()) {
            int maxId = maxIdGame.get().getId();
            nextId = maxId + nextId;
        }
        
        return new Game(nextId, title, desc, release_date, categories, price);
    }
    
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDesc() {
        return desc;
    }

    public String getReleaseDate() {
        return release_date;
    }

    public String[] getCategories() {
        return categories;
    }

    public float getPrice() {
        return price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setReleaseDate(String release_date) {
        this.release_date = release_date;
    }

    public void setCategories(String[] categories) {
        this.categories = categories;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
