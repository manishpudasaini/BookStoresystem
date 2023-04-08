package com.BookManagementSystem.BMS.controller.BookRegistrationController;

import com.BookManagementSystem.BMS.entity.Book;
import com.BookManagementSystem.BMS.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class BookRegister {
    @GetMapping("/register")
    public String registerBook(){
        return "BookRegister/register";
    }


    @Autowired
    private BookService bookService;

    @PostMapping("/save")
    public String addBook(@ModelAttribute Book book){
        bookService.addBooks(book);
        return "redirect:/available";
    }

}
