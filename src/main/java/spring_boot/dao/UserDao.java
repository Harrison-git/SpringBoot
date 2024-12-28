package spring_boot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spring_boot.model.User;


public interface UserDao extends JpaRepository<User, Long> {

    User findById(long id);

}
