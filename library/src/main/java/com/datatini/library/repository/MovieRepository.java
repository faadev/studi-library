package com.datatini.library.repository;

import com.datatini.library.pojo.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {

Movie findMovieByTitle(String title);


}
