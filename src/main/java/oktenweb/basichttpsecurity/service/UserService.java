package oktenweb.basichttpsecurity.service;


import oktenweb.basichttpsecurity.models.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    void save(User user);


}
