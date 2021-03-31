package co.trystan.mordheim.repository;

import co.trystan.mordheim.model.Bande;
import co.trystan.mordheim.model.Joueur;
import co.trystan.mordheim.model.Race;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface BandeRepository extends JpaRepository<Bande, Long> {
    List<Bande> findAll();
    @Query("SELECT b.race FROM Bande b WHERE b.id = :id")
    List<Race> findAllRaceByBandId(@Param("id")Long id);
    @Query("SELECT b.joueur FROM Bande b WHERE b.id = :id")
    List<Joueur> findAllJoueurByBandId(@Param("id")Long id);
}
