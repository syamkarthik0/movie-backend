package com.example.demo.model;

import java.time.LocalDate;
import jakarta.persistence.*;

@Entity
@Table(name = "movies")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="title")
    private String title;
    @Column(name="genre")
    private String genre;
    @Column(name="is_popular")
    private Boolean isPopular;
    @Column(name="release_date")
    private LocalDate releaseDate;
    @Column(name="poster_url")
    private String poster_url;
    @Column(name="rating")
    private Integer rating;

    // Constructors
    public Movie() {
    }

    public Movie(String title, String genre, Boolean isPopular,LocalDate releaseDate,String poster_url,Integer rating) {
        this.title = title;
        this.genre = genre;
        this.isPopular = isPopular;
        this.releaseDate=releaseDate;
        this.poster_url=poster_url;
        this.rating=rating;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Boolean getIsPopular(){
        return isPopular;
    }

    public void setPopular(Boolean isPopular) {
        this.isPopular = isPopular;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getPoster_url() {
        return poster_url;
    }

    public void setPoster_url(String poster_url) {
        this.poster_url = poster_url;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    // Getters and Setters
    // (Generate getters and setters for all fields)
    
}