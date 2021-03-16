package co.trystan.mordheim.repository;

import co.trystan.mordheim.model.TypeEquipement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeEquipementRepository extends JpaRepository<TypeEquipement, Long> {
}
