package ru.kata.spring.boot_security.demo.service;

import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;

public interface UserService {
    public void saveUser(User user);
    public User getUserById(Long id);
    public void deleteUserById(Long id);
    public List<User> getAllUsers();
}
