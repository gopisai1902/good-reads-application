package com.example.goodreads.model;

import com.example.goodreads.model.Publisher;
import jakarta.persistence.*;

@Entity
@Table(name = "book")
public class Book {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "imageurl")
    private String imageUrl;

    @ManyToOne
    @JoinColumn(name = " publisherid")
    private Publisher publisher;

    public Book(){

    }
    public Book(Integer id, String name, String imageUrl, Publisher publisher){
        this.id = id;
        this.name = name;
        this.imageUrl = imageUrl;
        this.publisher = publisher;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Publisher getPublisher(){
        return publisher;
    }

    public void setPublisher(Publisher publisher){
        this.publisher = publisher;
    }
}
