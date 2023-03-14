package pxl.be.researchproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pxl.be.researchproject.domain.User;
@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
