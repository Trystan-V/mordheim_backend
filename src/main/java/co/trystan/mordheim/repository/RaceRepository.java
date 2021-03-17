package co.trystan.mordheim.repository;

import co.trystan.mordheim.model.Race;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RaceRepository extends JpaRepository<Race, Long> {
    public List<Race> findByNameContaining(String name);
}
