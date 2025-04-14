package com.project.happytails.happytails.controller;

import com.project.happytails.happytails.domain.User;
import com.project.happytails.happytails.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/signup")
    public String signup(@RequestBody User user) {
        boolean success = userService.registerUser(user);
        return success ? "Signup successful!" : "Username already exists!";
    }

    @PostMapping("/login")
    public String login(@RequestBody User user) {
        boolean success = userService.loginUser(user.getUsername(), user.getPassword());
        return success ? "Login successful!" : "Invalid credentials!";
    }
}
