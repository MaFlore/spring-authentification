package com.example.auth.controller;

import com.example.auth.filter.RefreshTokenFilter;
import com.example.auth.request.RoleToUserForm;
import com.example.auth.model.User;
import com.example.auth.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.security.Principal;
import java.util.*;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public List<User> getUsers() {
        List<User> users = new ArrayList<>();
        try {
            users = this.userService.getUsers();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Erreur " + e.getMessage());
        }
        return users;
    }

    @RequestMapping(value = "/user/save", method = RequestMethod.POST, headers = "accept=Application/json")
    public User saveUser(@RequestBody User user) {
        try {
            user = this.userService.saveUser(user);
        } catch (Exception e) {
            System.out.println("Erreur " + e.getMessage());
        }
        return user;
    }

    @RequestMapping(value = "/role/add-to-user", method = RequestMethod.POST, headers = "accept=Application/json")
    public void addRoleToUser(@RequestBody RoleToUserForm form){
        this.userService.addRoleToUser(form.getUsername(), form.getNom());
    }

    @RequestMapping(value = "/user/info", method = RequestMethod.GET)
    public User infoUser(Principal principal){
        return userService.getUser(principal.getName());
    }

    @RequestMapping(value = "/refresh-token", method = RequestMethod.GET)
    public void refreshToken(HttpServletRequest request, HttpServletResponse response) throws IOException {
        RefreshTokenFilter refreshTokenFilter = new RefreshTokenFilter(userService);
        refreshTokenFilter.processRefreshToken(request, response);
    }
}
