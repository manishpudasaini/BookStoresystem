package com.BookManagementSystem.BMS.service;

import com.BookManagementSystem.BMS.entity.Book;
import com.BookManagementSystem.BMS.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public void addBooks(Book book){
        bookRepository.save(book);
    }

    public List<Book> getAllBook(){
        return bookRepository.findAll();
    }


    public Book getBookById(int id){
        return bookRepository.findById(id).get();
    }

//    public Book updateBook(int id,Book book){
//        Optional<Book> singleBook = bookRepository.findById(id);
//        if(singleBook.isPresent()){
//            Book updateBook = singleBook.get();
//            updateBook.setBook_name(book.getBook_name());
//            updateBook.setAuthor(book.getAuthor());
//            updateBook.setPrice(book.getPrice());
//
//            bookRepository.save(updateBook);
//
//            return updateBook;
//        }else {
//            throw new NoSuchElementException("Book is not present in the database!!!!");
//        }
//    }

    public void deletBook(int id){
        bookRepository.deleteById(id);
    }




}
