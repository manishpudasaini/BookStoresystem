package com.BookManagementSystem.BMS.security.service;

import com.BookManagementSystem.BMS.security.model.MyUserDetails;
import com.BookManagementSystem.BMS.security.model.Role;
import com.BookManagementSystem.BMS.security.repo.UserRepo;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepo userRepo;
    private final PasswordEncoder passwordEncoder;


    public UserService(UserRepo userRepo, PasswordEncoder passwordEncoder) {
        this.userRepo = userRepo;
        this.passwordEncoder = passwordEncoder;
    }

    public void addUser(MyUserDetails user){
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setRole(Role.USER);
        userRepo.save(user);
    }
}
