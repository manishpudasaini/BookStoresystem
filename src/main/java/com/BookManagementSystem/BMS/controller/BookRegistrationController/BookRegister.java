package com.BookManagementSystem.BMS.controller.BookRegistrationController;

import com.BookManagementSystem.BMS.entity.Book;
import com.BookManagementSystem.BMS.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class BookRegister {
    @Autowired
    private BookService bookService;
    @GetMapping("/register")
    public String registerBook(Model model){
        if(model.getAttribute("book") == null){
            model.addAttribute("book",new Book());
        }
        return "BookRegister/register";
    }

    @PostMapping("/save")
    public String addBook(@ModelAttribute Book book){
        bookService.addBooks(book);
        return "redirect:/available";
    }

}
