package co.trystan.mordheim.service;

import co.trystan.mordheim.model.Bande;
import co.trystan.mordheim.repository.BandeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;


import java.util.Optional;

@CrossOrigin
@Service
public class BandeServiceImpl implements BandeService {

    @Autowired
    private BandeRepository bandeRepository;

    @Override
    public Optional<Bande> findById(Long id) {
        return bandeRepository.findById(id);
    }

}
