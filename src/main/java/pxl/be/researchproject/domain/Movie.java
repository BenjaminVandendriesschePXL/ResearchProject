package pxl.be.researchproject.domain;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(name="movies")
public class Movie {

    @Id
    private Long id;
    private String title;
    private int releaseYear;

    private String genre;
    @ElementCollection
    private List<Long> directorId;

    public Movie(Long id, String title, int releaseYear, String genre, List<Long> directorId) {
        this.id = id;
        this.title = title;
        this.releaseYear = releaseYear;
        this.genre = genre;
        this.directorId = directorId;
    }

    public Movie() {

    }

    public void setId(Long id) {this.id = id;}
    public Long getId() {return id;}

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public List<Long> getDirectorId() {
        return directorId;
    }

    public void setDirectorId(List<Long> directorId) {
        this.directorId = directorId;
    }
    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", releaseYear=" + releaseYear +
                ", Genre='" + genre + '\'' +
                ", directorId=" + directorId +
                '}';
    }
}
