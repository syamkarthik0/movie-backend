package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.Local;
import org.springframework.stereotype.Service;
import com.example.demo.model.Movie;
import com.example.demo.repository.MovieRepository;
import java.util.Arrays;
import java.util.List;
import java.time.LocalDate;


@Service
public class MovieService {
    
     @Autowired
    private MovieRepository movieRepository;
     public List<Movie> getPopularMovies() {
        return movieRepository.findByIsPopularTrue();
    }

    public List<Movie> getMoviesByGenre(String genre) {
        return movieRepository.findByGenre(genre);
    }
        public List<Movie> getUpcomingMovies() {
            LocalDate today = LocalDate.now();
            return movieRepository.findByReleaseDateAfter(today);
        }
}