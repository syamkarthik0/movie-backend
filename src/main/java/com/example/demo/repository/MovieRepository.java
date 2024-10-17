package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.Movie;
import java.util.List;
import java.time.LocalDate;



public interface MovieRepository extends JpaRepository<Movie, Long> {
    List<Movie> findByIsPopularTrue(); // Fetch popular movies
    List<Movie> findByGenre(String genre); // Fetch movies by genre
    List<Movie> findByReleaseDateAfter(LocalDate date); // Fetch upcoming movies
}

