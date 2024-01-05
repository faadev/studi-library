package com.datatini.library.service;

import com.datatini.library.pojo.Movie;

import java.util.List;

public interface MovieService {

    Movie findMovieByIde(Long id);

    List<Movie> findAllMovie();

    void updateMovieById(Movie movie, Long id);

    void deleteMovieById(Long id);

    void createMovie(Movie movie);
}
