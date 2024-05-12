package fakkar.projetcinema.repositories;


import fakkar.projetcinema.entities.Projection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@Repository
@CrossOrigin("*")
public interface ProjectionRepository extends JpaRepository<Projection, Long> {
}
