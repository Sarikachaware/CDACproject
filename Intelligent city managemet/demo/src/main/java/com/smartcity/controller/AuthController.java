package com.smartcity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.smartcity.entity.User;
import com.smartcity.service.UserService;

@Controller
public class AuthController {

    @Autowired
    private UserService userService;

    // Login page
    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }

    // Registration page
    @GetMapping("/register")
    public String registerPage(Model model) {
        model.addAttribute("user", new User());
        return "register";
    }

    // Save new user
    @PostMapping("/register")
    public String registerUser(@ModelAttribute User user) {
        userService.registerUser(user);
        return "redirect:/login";
    }
}

