package com.mycompany.utn.steam.util;

import com.fasterxml.jackson.databind.ObjectMapper;
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
}