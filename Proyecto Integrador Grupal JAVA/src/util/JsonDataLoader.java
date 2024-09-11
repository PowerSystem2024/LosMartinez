package util;

import com.fasterxml.jackson.databind.ObjectMapper;
import model.User;

import java.io.InputStream;
import java.util.List;

public class JsonDataLoader {
    public static List<User> loadUsers() {
        try {
            ObjectMapper mapper = new ObjectMapper();
            InputStream is = JsonDataLoader.class.getResourceAsStream("/data/users.json");
            return mapper.readValue(is, mapper.getTypeFactory().constructCollectionType(List.class, User.class));
        } catch (Exception e) {
            throw new RuntimeException("Error loading users data", e);
        }
    }
}