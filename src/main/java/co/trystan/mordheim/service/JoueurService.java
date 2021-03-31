package co.trystan.mordheim.service;

import co.trystan.mordheim.model.Joueur;

import java.util.List;
import java.util.Optional;

public interface JoueurService {
    List<Joueur> findAll();
    Optional<Joueur> findById(Long id);
}
