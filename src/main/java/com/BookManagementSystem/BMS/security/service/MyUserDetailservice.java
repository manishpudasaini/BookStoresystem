package com.BookManagementSystem.BMS.security.service;

import com.BookManagementSystem.BMS.security.model.MyUserDetails;
import com.BookManagementSystem.BMS.security.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class MyUserDetailservice implements UserDetailsService {

    @Autowired
    private UserRepo userRepo;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<MyUserDetails> user =  userRepo.findByName(username);
        if(user.isPresent()){
            MyUserDetails singleUser = user.get();
            return singleUser;
        }else {
            throw new UsernameNotFoundException("User does not exist!!!");
        }
    }
}
