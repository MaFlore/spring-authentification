package com.example.auth.controller;

import com.example.auth.model.Role;
import com.example.auth.service.RoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class RoleController {

    private final RoleService roleService;

    @RequestMapping(value = "/role/save", method = RequestMethod.POST, headers = "accept=Application/json")
    public Role saveRole(@RequestBody Role role) {
        try {
            role = this.roleService.saveRole(role);
        } catch (Exception e) {
            System.out.println("Erreur " + e.getMessage());
        }
        return role;
    }

    @RequestMapping(value = "/role/{nom}", method = RequestMethod.GET)
    public Role getRole(@PathVariable String nom) {
        Role role = new Role();
        try {
            role = this.roleService.getRole(nom);
        } catch (Exception e) {
            System.out.println("Erreur " + e.getMessage());
        }
        return role;
    }

    @RequestMapping(value = "/roles", method = RequestMethod.GET)
    public List<Role> getRoles() {
        List<Role> roles = new ArrayList<>();
        try {
            roles = this.roleService.getRoles();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Erreur " + e.getMessage());
        }
        return roles;
    }
}
