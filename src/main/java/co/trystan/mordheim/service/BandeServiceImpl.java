package co.trystan.mordheim.service;

import co.trystan.mordheim.model.Bande;
import co.trystan.mordheim.repository.BandeRepository;
import org.springframework.beans.factory.annotation.Autowired;
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
    public List<Bande> findAll() {
        return bandeRepository.findAll();
    }

    @Override
    public Optional<Bande> findById(Long id) {
        return bandeRepository.findById(id);
    }

    @Override
    public Bande insert(Bande bande) {
        return bandeRepository.save(bande);
    }

    @Override
    public Bande update(Long id, Bande bande){
        Optional<Bande> optionalBande = this.findById(id);
        if (optionalBande.isPresent()){
            Bande bandeToUpdate = optionalBande.get();
            bandeToUpdate.setName(bande.getName());
            return bandeRepository.save(bandeToUpdate);
        }
        return null;
    }

    @Override
    public void delete(Long id) {
        Optional<Bande> bande = this.findById(id);
        if (bande.isPresent()){
            bandeRepository.delete(bande.get());
        }
    }
}
