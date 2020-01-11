package com.example.blog.BlogApi.domain;


import javax.persistence.*;

@Entity
@Table(name = "BLOG")
public class Blog {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @javax.persistence.Id
    @Column(name = "ID")
    private Long Id;
    @Column(name = "TITLE")
    String title;
    @Column(name = "DES")
    String description;
    @Column(name = "URL")
    String url;

    public Blog() {
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
