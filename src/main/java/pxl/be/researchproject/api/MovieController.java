package pxl.be.researchproject.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pxl.be.researchproject.service.MovieService;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {
    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping
    public List<MovieDTO> findAllMovies(){
        return movieService.findAllMovies();
    }
    @GetMapping("/{movieId}")
    public MovieDTO getMovieById(@PathVariable Long movieId){
        return movieService.findMovieById(movieId);
    }
    @PostMapping
    public ResponseEntity<Long> createSuperhero(@RequestBody MovieRequest movieRequest) {
        return new ResponseEntity<>(movieService.createMovie(movieRequest),
                HttpStatus.CREATED);}

    @PutMapping("/{movieId}")
    public MovieDTO updateMovie(@PathVariable Long movieId,@RequestBody MovieRequest movieRequest) {
        return movieService.updateMovie(movieId, movieRequest);
    }
    @DeleteMapping("/{superheroId}")
    public ResponseEntity<Void> deleteMovie(@PathVariable Long movieId) {boolean deleted = movieService.deleteMovie(movieId);
        return deleted? new ResponseEntity<>(HttpStatus.OK) : new ResponseEntity<>(HttpStatus.BAD_REQUEST);}
}
