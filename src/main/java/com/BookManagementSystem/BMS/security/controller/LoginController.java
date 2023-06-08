package com.BookManagementSystem.BMS.security.controller;

import com.BookManagementSystem.BMS.security.model.MyUserDetails;
import com.BookManagementSystem.BMS.security.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoginController {
    private final UserService userService;

    public LoginController(UserService userService) {
        this.userService = userService;
    }

//    @GetMapping("/signup")
//    public String loginPage(){
//        return "login/login";
//    }
    @PostMapping("/registration")
    public String registrationPage(@RequestBody MyUserDetails myUserDetails){
        userService.addUser(myUserDetails);
        return "user added successfully";
    }

//    @PostMapping("/saveUser")
//    public String saveUser(@ModelAttribute User user){
//        userService.addUser(user);
//        return "redirect:/registration";
//    }
}
