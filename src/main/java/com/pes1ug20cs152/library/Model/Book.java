package com.pes1ug20cs152.library.Model;


import jakarta.persistence.*;


@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "name", length = 100, nullable = false)
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

//    @Column(name = "serialName", length = 50, nullable = false)
//    private String serialName;
//    public String getSerialName() {
//        return serialName;
//    }
//    public void setSerialName(String firstName) {
//        this.serialName = serialName;
//    }

    @Column(name = "author", length = 250, nullable = false)
    private String author;
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

//    @Column(name = "publication", length = 50, nullable = false)
//    private String publication;

    public Book(){

    }

    public Book(String name, String author) {
        this.name = name;
//        this.serialName = serialName;
        this.author = author;
    }




}