package service;

import model.User;
import java.util.List;

public interface UserService {
    User getUserById(Long id);
    List<User> getAllUsers();
    void saveUser(User user);
    void deleteUser(Long id);
}