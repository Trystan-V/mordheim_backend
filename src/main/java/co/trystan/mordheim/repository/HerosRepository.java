package co.trystan.mordheim.repository;

import co.trystan.mordheim.model.Heros;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HerosRepository extends JpaRepository<Heros, Long> {
}
