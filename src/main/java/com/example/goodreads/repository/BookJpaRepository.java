package com.example.goodreads.repository;

import com.example.goodreads.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;



public interface BookJpaRepository extends JpaRepository<Book,Integer>{



}