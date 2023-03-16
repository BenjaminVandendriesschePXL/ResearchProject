package pxl.be.researchproject.api;

import pxl.be.researchproject.domain.Movie;

import java.util.List;

public record MovieDTO(Long id,
                       String title,
                       int releaseYear,
                       String genre,
                       List<Long> directorId) {

    public MovieDTO(Movie movie) {
        this(movie.getId(), movie.getTitle(), movie.getReleaseYear(), movie.getGenre(), movie.getDirectorId());
    }

    @Override
    public String toString() {
        return "MovieDTO{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", releaseYear=" + releaseYear +
                ", genre='" + genre + '\'' +
                ", directorId=" + directorId +
                '}';
    }
}
