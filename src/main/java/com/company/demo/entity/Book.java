package com.company.demo.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@EqualsAndHashCode
@Table
@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "genre")
    private String genre;

    @ManyToOne
    private Author author;

    @EqualsAndHashCode.Exclude
    @OneToMany(mappedBy = "book")
    private List<Source> sources;

}
