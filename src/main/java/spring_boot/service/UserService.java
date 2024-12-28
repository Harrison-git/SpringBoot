package spring_boot.service;

import spring_boot.model.User;

import java.util.List;

public interface UserService {

    void save(User user);

    List<User> findAll();

    User findById(long id);

    void update(User user);

    void deleteById(long id);
}
