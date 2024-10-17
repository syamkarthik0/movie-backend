    package com.example.demo.controller;

    import com.example.demo.model.Movie;
    import com.example.demo.service.MovieService;

    import org.springframework.http.HttpStatus;
    import org.springframework.http.ResponseEntity;
    import org.springframework.web.bind.annotation.CrossOrigin;
    import org.springframework.web.bind.annotation.GetMapping;
    import org.springframework.web.bind.annotation.PathVariable;
    import org.springframework.web.bind.annotation.RequestMapping;
    import org.springframework.web.bind.annotation.RestController;
    import java.util.List;

    @CrossOrigin(origins = "http://localhost:3000")  // Allow requests from the frontend
    @RestController
    @RequestMapping("/api/movies")
    public class MovieController {

        private final MovieService movieService;

        public MovieController(MovieService movieService) {
            this.movieService = movieService;
        }

        @GetMapping("/popular")
        public ResponseEntity<List<Movie>> getPopularMovies() {
            return ResponseEntity.ok(movieService.getPopularMovies());
        }
    
        @GetMapping("/genre/{genre}")
        public ResponseEntity<List<Movie>> getMoviesByGenre(@PathVariable String genre) {
            return ResponseEntity.ok(movieService.getMoviesByGenre(genre));
        }  
    
    }