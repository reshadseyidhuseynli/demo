package com.company.demo;

import com.company.demo.repository.AuthorRepository;
import com.company.demo.repository.BookRepository;
import com.company.demo.service.AuthorService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class DemoApp implements CommandLineRunner {

    private final AuthorService authorService;
    private final BookRepository bookRepository;

    public static void main(String[] args) {
        SpringApplication.run(DemoApp.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        authorService.getAll();
        authorService.getAllWithBooks();
//        bookRepository.findAll().forEach(System.out::println);
    }
}
