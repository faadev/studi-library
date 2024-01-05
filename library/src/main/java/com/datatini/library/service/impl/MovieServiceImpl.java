package com.datatini.library.service.impl;

import com.datatini.library.pojo.Movie;
import com.datatini.library.repository.MovieRepository;
import com.datatini.library.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    private MovieRepository movieRepository;
    @Override
    public Movie findMovieByIde(Long id) {
        //Porgrammation fonctionnelle


        return movieRepository.findById(id).orElse(null);
    }

    @Override
    public List<Movie> findAllMovie() {
        return movieRepository.findAll();
    }
    @Override
    public void updateMovieById(Movie movie, Long id) {

        //1.Recupération du movie en base
        Movie oldMovie = this.findMovieByIde(id);

        //2.Je verifie que mon oldMovie n'est pas vide
        if(oldMovie != null) {

            //3. mise à jour des champs
            oldMovie.setDescription(movie.getDescription());
            oldMovie.setTitle(movie.getTitle());

            //4. Je remets le oldMovie en base
            movieRepository.save(oldMovie);


        }

    }

    @Override
    public void deleteMovieById(Long id) {
        movieRepository.deleteById(id);

    }

    @Override
    public void createMovie(Movie movie) {
        movieRepository.save(movie);

    }
}
