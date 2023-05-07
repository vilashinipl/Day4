package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.book;

public interface bookRepo extends JpaRepository<book,Integer>{

}
