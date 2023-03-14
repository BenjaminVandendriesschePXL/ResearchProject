package pxl.be.researchproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pxl.be.researchproject.domain.Review;

@Repository
public interface ReviewRepository extends JpaRepository<Review,Long> {
}
