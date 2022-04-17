package mate.academy.service;

import mate.academy.model.Movie;

import java.util.List;

public interface MovieService {
    Movie add(Movie movie);

    Movie get(Long id);

    List<Movie> getAll();
}
