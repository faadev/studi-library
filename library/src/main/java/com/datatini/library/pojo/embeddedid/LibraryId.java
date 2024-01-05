package com.datatini.library.pojo.embeddedid;

import com.datatini.library.pojo.Movie;
import com.datatini.library.pojo.User;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.io.Serializable;

@Embeddable
public class LibraryId implements Serializable {

    @ManyToOne
    @JoinColumn(name = "username")
    private User user;

    @ManyToOne
    @JoinColumn(name = "movie_id")
    private Movie movie;
}
