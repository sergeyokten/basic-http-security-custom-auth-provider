package oktenweb.basichttpsecurity.dao;

import oktenweb.basichttpsecurity.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDAO extends JpaRepository<User, Integer> {

    User findByUsername(String username);
}
