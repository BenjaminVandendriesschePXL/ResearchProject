package pxl.be.researchproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pxl.be.researchproject.api.MovieDTO;
import pxl.be.researchproject.domain.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {
}
