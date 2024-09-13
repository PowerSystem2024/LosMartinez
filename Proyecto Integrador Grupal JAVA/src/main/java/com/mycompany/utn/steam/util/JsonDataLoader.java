package com.mycompany.utn.steam.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mycompany.utn.steam.model.Menu;
import com.mycompany.utn.steam.model.User;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class JsonDataLoader {
    public static List<User> loadUsers() {
        try {
            ObjectMapper mapper = new ObjectMapper();
            InputStream is = JsonDataLoader.class.getResourceAsStream("/data/users.json");
            return mapper.readValue(is, mapper.getTypeFactory().constructCollectionType(List.class, User.class));
        } catch (IOException e) {
            throw new RuntimeException("Error loading users data", e);
        }
    }
    
    public static Menu getMenuData(String menuSlug) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            InputStream is = JsonDataLoader.class.getResourceAsStream("/data/menu-options.json");
            List<Menu> allMenus = mapper.readValue(is, mapper.getTypeFactory().constructCollectionType(List.class, Menu.class));
            return allMenus.stream()
                           .filter(menu -> menu.getSlug().equals(menuSlug))
                           .findFirst()
                           .orElseThrow(() -> new IllegalArgumentException("ERROR: Menu slug not found in menu-options.json"));
        } catch (IOException e) {
            throw new RuntimeException("Error loading users data", e);
        }
    }
}