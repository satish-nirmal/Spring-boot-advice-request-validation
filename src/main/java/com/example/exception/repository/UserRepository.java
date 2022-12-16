package com.example.exception.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.exception.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
