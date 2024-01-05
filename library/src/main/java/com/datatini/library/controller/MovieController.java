package com.datatini.library.controller;

import com.datatini.library.pojo.Movie;
import com.datatini.library.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //REST (consommation et production de JSON)
@RequestMapping("api/movie")
public class MovieController {


    @Autowired
    private MovieService movieService;


    @GetMapping
    List<Movie> findAllMovie() {
        return movieService.findAllMovie();
    }
@PostMapping
    void createMovie(@RequestBody Movie movie) {
        movieService.createMovie(movie);
}
@DeleteMapping("/{id}")
    void deleteMovieById(@PathVariable("id") Long toto){
        movieService.deleteMovieById(toto);
}
}
