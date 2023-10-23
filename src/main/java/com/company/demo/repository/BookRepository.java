package com.company.demo.repository;

import com.company.demo.entity.Author;
import com.company.demo.entity.Book;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Integer> {

    //    @EntityGraph(value = "authorGraph")
    @EntityGraph(attributePaths = {"sources"})
    List<Book> findAll();

}
