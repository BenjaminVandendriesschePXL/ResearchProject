package pxl.be.researchproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pxl.be.researchproject.api.MovieDTO;
import pxl.be.researchproject.domain.Movie;

import java.util.*;

@Repository
public class MovieRepository {
    private HashMap<Long,Movie> movies;

    public MovieRepository(){
        movies = new HashMap<>();
    }
    public List<Movie> findAll() {
        return new ArrayList<Movie>(movies.values());
    }

    public Movie getReferenceById(Long movieId) {
        return movies.get(movieId);
    }

    public Optional<Movie> findById(Long movieId) {
        return Optional.ofNullable(movies.get(movieId));
    }

    public Movie save(Movie movie) {
        movies.put(movie.getId(),movie);
        return movie;
    }

    public void delete(Movie movie) {
        movies.remove(movie.getId());
    }
}
