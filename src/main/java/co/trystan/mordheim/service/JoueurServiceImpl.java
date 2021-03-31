package co.trystan.mordheim.service;

import co.trystan.mordheim.model.Joueur;
import co.trystan.mordheim.repository.JoueurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@Service
public class JoueurServiceImpl implements JoueurService {

    @Autowired
    JoueurRepository joueurRepository;


    @Override
    public List<Joueur> findAll() {
        return joueurRepository.findAll();
    }

    @Override
    public Optional<Joueur> findById(Long id) {
        return joueurRepository.findById(id);
    }

}
