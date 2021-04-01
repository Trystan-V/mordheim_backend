package co.trystan.mordheim.service;

import co.trystan.mordheim.model.Bande;
import co.trystan.mordheim.model.Joueur;
import co.trystan.mordheim.model.Race;
import co.trystan.mordheim.repository.BandeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;


import java.util.List;
import java.util.Optional;

@CrossOrigin
@Service
public class BandeServiceImpl implements BandeService {

    @Autowired
    private BandeRepository bandeRepository;

    @Override
    public List<Bande> findAll(int page, int size) {
        return bandeRepository.findAll(PageRequest.of(page, size)).toList();
    }

    @Override
    public Bande findById(Long id) {
        return bandeRepository.findById(id).orElse(null);
    }

    @Override
    public Bande insert(Bande bande) {
        return bandeRepository.save(bande);
    }

    @Override
    public Bande update(Long id, Bande bande){
        Bande optionalBande = this.findById(id);
        if (optionalBande != null){
            Bande bandeToUpdate = optionalBande;
            bandeToUpdate.setName(bande.getName());
            return bandeRepository.save(bandeToUpdate);
        }
        return null;
    }

    @Override
    public void delete(Long id) {
        Bande bande = this.findById(id);
        if (bande != null){
            bandeRepository.delete(bande);
        }
    }

    @Override
    public List<Race> findAllRaceByBandId(Long id) {
        return bandeRepository.findAllRaceByBandId(id);
    }

    @Override
    public List<Joueur> findAllJoueurByBandId(Long id) {
        return bandeRepository.findAllJoueurByBandId(id);
    }
}
