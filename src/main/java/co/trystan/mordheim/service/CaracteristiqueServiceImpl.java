package co.trystan.mordheim.service;

import co.trystan.mordheim.repository.CaracteristiqueRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@Service
public class CaracteristiqueServiceImpl implements CaracteristiqueService {

    CaracteristiqueRepository caracteristiqueRepository;
}
