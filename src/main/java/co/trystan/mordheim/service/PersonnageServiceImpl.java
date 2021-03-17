package co.trystan.mordheim.service;

import co.trystan.mordheim.repository.PersonnageRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@Service
public class PersonnageServiceImpl implements PersonnageService {

    PersonnageRepository personnageRepository;

}
