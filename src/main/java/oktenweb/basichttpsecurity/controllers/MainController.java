package oktenweb.basichttpsecurity.controllers;

import oktenweb.basichttpsecurity.dao.UserDAO;
import oktenweb.basichttpsecurity.models.User;
import oktenweb.basichttpsecurity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class MainController {


    @GetMapping("/user/asd")
    public String asd() {
        return "ok";
    }

    @Autowired
    private UserService userService;

    @Autowired
    private UserDAO userDAO;

    
    @Autowired
    private PasswordEncoder passwordEncoder;
    @GetMapping("/save")
    public void save(@RequestParam String username, @RequestParam String password) {

        userService.save(new User(username, passwordEncoder.encode(password), Arrays.asList("ROLE_USER")));
        userDAO.findAll().stream().forEach(System.out::print);
    }


    @GetMapping("/showUsers")
    public void showUsers() {
        userDAO.findAll().stream().forEach(System.out::print);

    }
}
