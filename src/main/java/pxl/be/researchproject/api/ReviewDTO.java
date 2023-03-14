package pxl.be.researchproject.api;

import java.util.Date;

public record ReviewDTO(Long id,
                        Long movieId,
                        Long userId,
                        String comment,
                        int rating,
                        Date timestamp) {
}
