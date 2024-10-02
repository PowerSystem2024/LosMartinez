package com.mycompany.utn.steam.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Menu {
    private String slug;
    private String title;
    private String[] options;

    // Constructor, getters y setters
    @JsonCreator
    public Menu(@JsonProperty("slug") String slug, @JsonProperty("title") String title, @JsonProperty("options") String[] options) {
        this.slug = slug;
        this.title = title;
        this.options = options;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String[] getOptions() {
        return options;
    }

    public void setOptions(String[] options) {
        this.options = options;
    }
}
