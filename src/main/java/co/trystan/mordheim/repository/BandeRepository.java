package co.trystan.mordheim.repository;

import co.trystan.mordheim.model.Bande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BandeRepository extends JpaRepository<Bande, Long> {
}
