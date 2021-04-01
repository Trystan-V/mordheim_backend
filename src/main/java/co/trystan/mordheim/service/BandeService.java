package co.trystan.mordheim.service;

import co.trystan.mordheim.model.Bande;
import co.trystan.mordheim.model.Joueur;
import co.trystan.mordheim.model.Race;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface BandeService {
    List<Bande> findAll(int page, int size);

    Bande findById(Long id);

    Bande insert(Bande bande);

    Bande update(Long id, Bande bande);

    void delete(Long id);

    List<Race> findAllRaceByBandId(Long id);

    List<Joueur> findAllJoueurByBandId(Long id);


}
