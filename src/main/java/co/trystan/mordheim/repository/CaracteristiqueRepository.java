package co.trystan.mordheim.repository;

import co.trystan.mordheim.model.Caracteristique;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CaracteristiqueRepository extends JpaRepository<Caracteristique, Long> {
}
