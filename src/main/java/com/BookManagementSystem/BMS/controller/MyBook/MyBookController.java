package com.BookManagementSystem.BMS.controller.MyBook;

import com.BookManagementSystem.BMS.entity.Book;
import com.BookManagementSystem.BMS.entity.MyBooks;
import com.BookManagementSystem.BMS.service.BookService;
import com.BookManagementSystem.BMS.service.MyBookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping
public class MyBookController {

    private BookService service;
    private MyBookService myBookService;

    @GetMapping("/myBooks")
    public String myBooks(){
        return "MyBooks/myBooks";
    }

//    @RequestMapping("/myList/{id}")
//    public String getMylist(@PathVariable("id") int id ){
//        Book b = service.getBookById(id);
//        MyBooks myBooks = new MyBooks(b.getId(),b.getBook_name(),b.getAuthor(),b.getPrice());
//        myBookService.saveMyBooks(myBooks);
//        return "redirect:/myBooks";
//
//    }
      





}
