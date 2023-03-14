package pxl.be.researchproject;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import pxl.be.researchproject.domain.Movie;
import pxl.be.researchproject.repository.DirectorRepository;
import pxl.be.researchproject.repository.MovieRepository;
import pxl.be.researchproject.repository.ReviewRepository;
import pxl.be.researchproject.repository.UserRepository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class StartupRunner implements CommandLineRunner {
    private final MovieRepository movieRepository;
    private final ReviewRepository reviewRepository;
    private final UserRepository userRepository;
    private final DirectorRepository directorRepository;

    public StartupRunner(MovieRepository movieRepository, ReviewRepository reviewRepository, UserRepository userRepository, DirectorRepository directorRepository) {
        this.movieRepository = movieRepository;
        this.reviewRepository = reviewRepository;
        this.userRepository = userRepository;
        this.directorRepository = directorRepository;
    }
    @Override
    public void run(String... args) throws Exception {
        movieRepository.save(new Movie(1L,"Avatar",2009,"Action Adventure Fantasy Sci-Fi", List.of(1L)));
        movieRepository.save(new Movie(2L,"Avangers:Endgame",2019,"Action Adventure Drama Sci-Fi", List.of(2L,3L)));
        movieRepository.save(new Movie(3L,"Avatar: The Way of Water",2022,"Action Adventure Fantasy Sci-Fi", List.of(1L)));
        movieRepository.save(new Movie(4L,"Titanic",1997,"Drama Romance", List.of(1L)));
        movieRepository.save(new Movie(5L,"Star Wars: Episode VII",2015,"Action Adventure Sci-Fi", List.of(4L)));
        movieRepository.save(new Movie(6L,"Avengers:Infinity War",2018,"Action Adventure Sci-Fi", List.of(2L,3L)));
        movieRepository.save(new Movie(7L,"Spider-Man:No Way Home",2021,"Action Adventure Fantasy Sci-Fi", List.of(5L)));
        movieRepository.save(new Movie(8L,"Jurassic World",2015,"Action Adventure Sci-Fi", List.of(6L)));
        movieRepository.save(new Movie(9L,"The Lion King",2019,"Adventure Animation Drama Family Musical", List.of(7L)));
        movieRepository.save(new Movie(10L,"The Avengers",2012,"Action Sci-Fi", List.of(81L)));
        movieRepository.save(new Movie(11L,"Furious 7",2015,"Action Crime Thriller", List.of(9L)));
        movieRepository.save(new Movie(12L,"Top Gun: Maverick",2022,"Action Drama", List.of(10L)));
        movieRepository.save(new Movie(13L,"Frozen II",2019,"Adventure Animation Comedy Drama Family Fantasy Musical", List.of(11L,12L)));
        movieRepository.save(new Movie(14L,"Avengers:Age of Ultron",2015,"Action Adventure Sci-Fi", List.of(8L)));
        movieRepository.save(new Movie(15L,"Black Panther",2018,"Action Adventure Sci-Fi", List.of(13L)));
        movieRepository.save(new Movie(16L,"Harry Potter and the Deathly Hallows:Part 2",2011,"Adventure Family Fantasy Mystery", List.of(14L)));
        movieRepository.save(new Movie(17L,"Star Wars: Episode VIII",2017,"Action Adventure Fantasy Sci-Fi", List.of(15L)));
        movieRepository.save(new Movie(18L,"Jurassic World: Fallen Kingdoms",2018,"Action Adventure Sci-Fi", List.of(16L)));
        movieRepository.save(new Movie(19L,"Frozen",2013,"Adventure Animation Comedy Family Fantasy Musical", List.of(11L,12L)));
        movieRepository.save(new Movie(20L,"Beauty and the Beast",2017,"Adventure Family Fantasy Musical Romance", List.of(17L)));

    }
}
