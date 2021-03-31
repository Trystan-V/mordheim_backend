package co.trystan.mordheim.repository;

import co.trystan.mordheim.model.Joueur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JoueurRepository extends JpaRepository<Joueur, Long> {
    public List<Joueur> findAll();
}
