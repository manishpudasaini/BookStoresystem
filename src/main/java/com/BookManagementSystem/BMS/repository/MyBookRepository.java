package com.BookManagementSystem.BMS.repository;

import com.BookManagementSystem.BMS.entity.MyBooks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyBookRepository extends JpaRepository<MyBooks,Integer> {
}
