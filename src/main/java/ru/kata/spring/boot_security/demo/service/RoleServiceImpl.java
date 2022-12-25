package ru.kata.spring.boot_security.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.kata.spring.boot_security.demo.model.Role;
import ru.kata.spring.boot_security.demo.repository.RoleRepository;

import java.util.HashSet;
import java.util.Set;


@Service
public class RoleServiceImpl implements RoleService {
    private final RoleRepository repository;

    @Autowired
    public RoleServiceImpl(RoleRepository repository) {
        this.repository = repository;
    }

    @Override
    @Transactional
    public Set<Role> getAll() {
        return new HashSet<>(repository.findAll());
    }

    @Override
    @Transactional
    public Role findRoleByName(String role) {
        return repository.findRoleByName(role);
    }

    @Override
    @Transactional
    public Set<Role> getRole(long id) {
        Set<Role> roles = new HashSet<>();
        roles.add(repository.getById(id));
        return roles;
    }


}
