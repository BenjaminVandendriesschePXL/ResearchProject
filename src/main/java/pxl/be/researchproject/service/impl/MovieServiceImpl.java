package pxl.be.researchproject.service.impl;

import org.springframework.stereotype.Service;
import pxl.be.researchproject.api.MovieDTO;
import pxl.be.researchproject.api.MovieRequest;
import pxl.be.researchproject.domain.Movie;
import pxl.be.researchproject.repository.MovieRepository;
import pxl.be.researchproject.service.MovieService;

import java.util.List;
@Service
public class MovieServiceImpl implements MovieService {
    private final MovieRepository movieRepository;

    public MovieServiceImpl(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public List<MovieDTO> findAllMovies() {
        return movieRepository.findAll().stream().map(MovieDTO::new).toList();
    }

    @Override
    public MovieDTO findMovieById(Long movieId) {
        return new MovieDTO(movieRepository.getReferenceById(movieId));
    }

    @Override
    public Long createMovie(MovieRequest movieRequest) {
        Movie movie = new Movie();
        movie.setId(movieRequest.getId());
        movie.setTitle(movieRequest.getTitle());
        movie.setReleaseYear(movieRequest.getReleaseYear());
        movie.setDirectorId(movieRequest.getDirectorId());
        Movie newMovie = movieRepository.save(movie);
        return newMovie.getId();
    }

    @Override
    public MovieDTO updateMovie(Long movieId, MovieRequest movieRequest) {
        return movieRepository.findById(movieId).map(movie->{
            movie.setTitle(movieRequest.getTitle());
            movie.setReleaseYear(movieRequest.getReleaseYear());
            movie.setGenre(movieRequest.getGenre());
            movie.setDirectorId(movieRequest.getDirectorId());
            return new MovieDTO(movieRepository.save(movie));
        }).orElseThrow(()-> new ResourceNotFoundException("Movie","id",movieId.toString()));
    }

    @Override
    public boolean deleteMovie(Long movieId) {
        return movieRepository.findById(movieId).map(movie -> {
            movieRepository.delete(movie);
            return true;
        }).orElseThrow(()-> new ResourceNotFoundException("Movie","id",movieId.toString()));
    }
}
