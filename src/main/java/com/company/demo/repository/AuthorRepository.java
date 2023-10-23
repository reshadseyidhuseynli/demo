package com.company.demo.repository;

import com.company.demo.entity.Author;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AuthorRepository extends JpaRepository<Author, Integer> {

    //    @EntityGraph(value = "authorGraph")
    @EntityGraph(attributePaths = {"books", "books.sources"},type = EntityGraph.EntityGraphType.FETCH)
    List<Author> findAll();

}