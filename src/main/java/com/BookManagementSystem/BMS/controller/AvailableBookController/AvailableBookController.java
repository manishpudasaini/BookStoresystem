package com.BookManagementSystem.BMS.controller.AvailableBookController;

import com.BookManagementSystem.BMS.entity.Book;
import com.BookManagementSystem.BMS.repository.BookRepository;
import com.BookManagementSystem.BMS.service.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping
public class AvailableBookController {
    @GetMapping("/available")
    public String availableBook(){
        return "AvailableBook/availableBook";
    }

    private BookService service ;

    @GetMapping("/availableBook")
    public ModelAndView bookInfo(){
        List<Book> list = service.getBook();
        return new ModelAndView("AvailableBook/availableBook","book",list);
    }


}
