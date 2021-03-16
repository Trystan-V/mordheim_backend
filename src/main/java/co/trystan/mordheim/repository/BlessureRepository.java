package co.trystan.mordheim.repository;

import co.trystan.mordheim.model.Blessure;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlessureRepository  extends JpaRepository<Blessure, Long> {
}
