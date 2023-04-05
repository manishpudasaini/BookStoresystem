package com.BookManagementSystem.BMS.repository;

import com.BookManagementSystem.BMS.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book,Integer> {

}
