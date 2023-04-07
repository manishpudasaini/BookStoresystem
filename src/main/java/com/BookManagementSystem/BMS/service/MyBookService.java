package com.BookManagementSystem.BMS.service;

import com.BookManagementSystem.BMS.entity.Book;
import com.BookManagementSystem.BMS.entity.MyBooks;
import com.BookManagementSystem.BMS.repository.MyBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyBookService {

    @Autowired
    private MyBookRepository myBookRepository;

    public void saveMyBooks(MyBooks books){
        myBookRepository.save(books);
    }

    public List<MyBooks> getAllMyBooks(){
        return myBookRepository.findAll();
    }


}
