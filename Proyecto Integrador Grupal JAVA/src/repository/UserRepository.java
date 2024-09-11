package repository;

import model.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository {
    Optional<User> findById(Long id);
    List<User> findAll();
    void save(User user);
    void deleteById(Long id);
}