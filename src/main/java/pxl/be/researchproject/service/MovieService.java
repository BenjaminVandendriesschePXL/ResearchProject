package pxl.be.researchproject.service;

import org.springframework.stereotype.Service;
import pxl.be.researchproject.api.MovieDTO;
import pxl.be.researchproject.api.MovieRequest;

import java.util.List;

public interface MovieService {
    List<MovieDTO> findAllMovies();
    MovieDTO findMovieById(Long movieId);
    Long createMovie(MovieRequest movieRequest);
    MovieDTO updateMovie(Long movieId, MovieRequest movieRequest);
    boolean deleteMovie(Long movieId);
}
