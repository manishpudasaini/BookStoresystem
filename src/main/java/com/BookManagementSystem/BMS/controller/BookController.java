package com.BookManagementSystem.BMS.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class BookController {

    @GetMapping("/home")
    public String mainPage(){
        return "main";
    }


}
