package com.java.rail2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.rail2.model.User;

public interface UserRepo extends JpaRepository<User,Integer>{
    
}
