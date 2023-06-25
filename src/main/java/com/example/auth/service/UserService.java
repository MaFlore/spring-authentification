package com.example.auth.service;

import com.example.auth.model.Role;
import com.example.auth.model.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String username, String nom);
    User getUser(String username);
    List<User> getUsers();
}
