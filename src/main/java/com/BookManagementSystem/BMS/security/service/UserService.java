package com.BookManagementSystem.BMS.security.service;

import com.BookManagementSystem.BMS.security.model.User;
import com.BookManagementSystem.BMS.security.repo.UserRepo;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    public final UserRepo userRepo;

    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public User addUser(User user){
        return userRepo.save(user);
    }
}
