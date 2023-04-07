package com.BookManagementSystem.BMS.service;

import com.BookManagementSystem.BMS.entity.Book;
import com.BookManagementSystem.BMS.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public void addBooks(Book book){
        bookRepository.save(book);
    }

    public List<Book> getBook(){
        return bookRepository.findAll();
    }



    public Book getBookById(int id){
        return bookRepository.findById(id).get();
    }




}
