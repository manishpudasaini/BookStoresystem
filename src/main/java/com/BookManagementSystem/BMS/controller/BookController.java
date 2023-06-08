package com.BookManagementSystem.BMS.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@PreAuthorize("hasAuthority('USER')")
@RequestMapping("/home")
public class BookController {

    @GetMapping()
    public String mainPage(){
        return "main";
    }


}
