package nirla.uas.repo;

import nirla.uas.model.Fakta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FaktaRepo extends JpaRepository<Fakta, Integer> {
}
