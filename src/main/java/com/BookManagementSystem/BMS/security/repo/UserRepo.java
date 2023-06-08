package com.BookManagementSystem.BMS.security.repo;

import com.BookManagementSystem.BMS.security.model.MyUserDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepo extends JpaRepository<MyUserDetails,Long> {
    Optional<MyUserDetails> findByName(String name);
}
