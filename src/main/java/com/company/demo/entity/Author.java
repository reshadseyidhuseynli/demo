package com.company.demo.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@EqualsAndHashCode
@Entity
//@NamedEntityGraphs({
//        @NamedEntityGraph(
//                name = "authorGraph",
//                attributeNodes = @NamedAttributeNode(value = "books", subgraph = "bookGraph"),
//                subgraphs = {
//                        @NamedSubgraph(name = "bookGraph", attributeNodes = {@NamedAttributeNode("sources")})
//                }
//        )
//})
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;

    @EqualsAndHashCode.Exclude
    @OneToMany(mappedBy = "author")
    private List<Book> books;

}
