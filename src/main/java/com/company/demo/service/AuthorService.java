package com.company.demo.service;

import com.company.demo.entity.Author;
import com.company.demo.repository.AuthorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AuthorService {

    private final AuthorRepository authorRepository;

    public void getAll() {
        System.err.println("Called authorServce.getAll()");

        List<Author> authors = authorRepository.findAll();
        System.out.println("Authors{");
        authors.forEach(author -> System.out.println(author.getName()));
        System.out.println("}");
    }

    @Transactional
    public void getAllWithBooks() {
        System.err.println("Called authorServce.getAllWithBooks()");

        List<Author> authors = authorRepository.findAll();
        System.out.println("Authors{");
        authors.forEach(author -> System.out.println(author.getName()));
        System.out.println("}");


        System.out.println("Books{");
        authors.forEach(author -> author.getBooks()
                .forEach(book -> System.out.println(book.getName())));
        System.out.println("}");
    }

}
