package com.smartcity.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartcity.entity.User;

import com.smartcity.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // Register new user
    public User registerUser(User user) {
        return userRepository.save(user);
    }

    // Login user
    public Optional<User> login(String email) {
        return userRepository.findByEmail(email);
    }

    // Get all users
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    

    // Get user by id
    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }
}

