package com.smartcity.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.smartcity.entity.User;
import com.smartcity.entity.Department;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    // Used for login
    Optional<User> findByEmail(String email);

    // Check if email already exists (registration)
    boolean existsByEmail(String email);

    

    

	User save(User user);
}

