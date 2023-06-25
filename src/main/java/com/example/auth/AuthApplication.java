package com.example.auth;

import com.example.auth.model.Role;
import com.example.auth.model.User;
import com.example.auth.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.ArrayList;

@SpringBootApplication
public class AuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(AuthApplication.class, args);
    }

    @Bean
    PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
    @Bean
    CommandLineRunner run(UserService userService){
        return args -> {
            userService.saveRole(new Role(null,"ROLE_USER"));
            userService.saveRole(new Role(null,"ROLE_MANAGER"));
            userService.saveRole(new Role(null,"ROLE_ADMIN"));
            userService.saveRole(new Role(null,"ROLE_SUPER_ADMIN"));

            userService.saveUser(new User(null,"TOGBE","Junior","1234",new ArrayList<>()));
            userService.saveUser(new User(null,"TOGBE","Rita","1234",new ArrayList<>()));
            userService.saveUser(new User(null,"TOGBE","Phillipe","1234",new ArrayList<>()));
            userService.saveUser(new User(null,"TOGBE","Victor","1234",new ArrayList<>()));

            userService.addRoleToUser("Junior", "ROLE_USER");
            userService.addRoleToUser("Rita", "ROLE_MANAGER");
            userService.addRoleToUser("Phillipe", "ROLE_ADMIN");
            userService.addRoleToUser("Victor", "ROLE_SUPER_ADMIN");
            userService.addRoleToUser("Victor", "ROLE_ADMIN");
            userService.addRoleToUser("Victor", "ROLE_USER");
        };
    }
}
