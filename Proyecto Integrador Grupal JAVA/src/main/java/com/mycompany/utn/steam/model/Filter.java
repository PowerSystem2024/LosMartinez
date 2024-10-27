package com.mycompany.utn.steam.model;

public class Filter {
    private String title;
    private String release_date_before;
    private String release_date_after;
    private String[] categories;
    private Float price_min;
    private Float price_max;
    private Boolean owned;
    private Boolean favourite;

    // Constructor
    public Filter(String title, String release_date_before, String release_date_after, 
                  String[] categories, Float price_min, Float price_max, 
                  Boolean owned, Boolean favourite) {
        this.title = title;
        this.release_date_before = release_date_before;
        this.release_date_after = release_date_after;
        this.categories = categories;
        this.price_min = price_min;
        this.price_max = price_max;
        this.owned = owned;
        this.favourite = favourite;
    }
    
    // Getters
    public String getTitle() {
        return title;
    }

    public String getReleaseDateBefore() {
        return release_date_before;
    }

    public String getReleaseDateAfter() {
        return release_date_after;
    }

    public String[] getCategories() {
        return categories;
    }

    public Float getPriceMin() {
        return price_min;
    }

    public Float getPriceMax() {
        return price_max;
    }

    public Boolean isOwned() {
        return owned;
    }

    public Boolean isFavourite() {
        return favourite;
    }

    // Setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setReleaseDateBefore(String release_date_before) {
        this.release_date_before = release_date_before;
    }

    public void setReleaseDateAfter(String release_date_after) {
        this.release_date_after = release_date_after;
    }

    public void setCategories(String[] categories) {
        this.categories = categories;
    }

    public void setPriceMin(Float price_min) {
        this.price_min = price_min;
    }

    public void setPriceMax(Float price_max) {
        this.price_max = price_max;
    }

    public void setOwned(Boolean owned) {
        this.owned = owned;
    }

    public void setFavourite(Boolean favourite) {
        this.favourite = favourite;
    }
}