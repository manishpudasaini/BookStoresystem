package com.BookManagementSystem.BMS.security.controller;

import com.BookManagementSystem.BMS.security.model.User;
import com.BookManagementSystem.BMS.security.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController {
    private final UserService userService;

    public LoginController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public String loginPage(){
        return "login/login";
    }
    @GetMapping("/registration")
    public String registrationPage(Model model){
        model.addAttribute("user",new User());
        return "login/registration";
    }

    @PostMapping("/user/save")
    public String saveUser(@ModelAttribute User user){
        userService.addUser(user);
        return "redirect:/";
    }
}
