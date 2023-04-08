package com.BookManagementSystem.BMS.controller.AvailableBookController;

import com.BookManagementSystem.BMS.entity.Book;
import com.BookManagementSystem.BMS.entity.MyBooks;
import com.BookManagementSystem.BMS.repository.BookRepository;
import com.BookManagementSystem.BMS.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping
public class AvailableBookController {

    @Autowired
    private BookService service ;

    @GetMapping("/available")
    public String availableBook(Model model){
        List<Book> availableBooks = service.getAllBook();
        model.addAttribute("book",availableBooks);
        return "AvailableBook/availableBook";
    }



}
