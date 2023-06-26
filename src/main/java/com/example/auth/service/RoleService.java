package com.example.auth.service;

import com.example.auth.model.Role;

import java.util.List;

public interface RoleService {
    Role saveRole(Role role);
    Role getRole(String nom);
    List<Role> getRoles();
}
