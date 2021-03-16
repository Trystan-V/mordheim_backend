package co.trystan.mordheim.repository;

import co.trystan.mordheim.model.RegleSpeciale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegleSpecialeRepository extends JpaRepository<RegleSpeciale, Long> {
}
