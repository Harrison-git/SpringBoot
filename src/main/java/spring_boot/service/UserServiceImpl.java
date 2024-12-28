package spring_boot.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring_boot.dao.UserDao;
import spring_boot.model.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void save(User user) {
        userDao.save(user);
    }

    @Override
    public List<User> findAll() {
        List<User> users = userDao.findAll();
        return users;
    }

    @Override
    public User findById(long id) {
        User user = userDao.findById(id);
        return user;
    }

    @Override
    public void update(User user) {
        userDao.save(user);
    }

    @Override
    public void deleteById(long id) {
        userDao.deleteById(id);
    }
}
