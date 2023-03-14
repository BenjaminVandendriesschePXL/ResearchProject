package pxl.be.researchproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pxl.be.researchproject.domain.Director;

@Repository
public interface DirectorRepository extends JpaRepository<Director,Long> {
}
