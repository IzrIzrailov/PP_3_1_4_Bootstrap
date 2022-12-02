package ru.kata.spring.boot_security.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ru.kata.spring.boot_security.demo.model.User;
import ru.kata.spring.boot_security.demo.service.UserService;
import ru.kata.spring.boot_security.demo.service.UserServiceImpl;

@Controller
public class IndexController {

    private final UserService userService;

    @Autowired
    public IndexController(UserServiceImpl userService) {
        this.userService = userService;
    }

    @GetMapping("/registration")
    public String createUserForm(User user) {
        return "registration";
    }

    @PostMapping("/registration")
    public String createUser(User user) {
        userService.saveUser(user);
        return "redirect:/login";
    }
}
