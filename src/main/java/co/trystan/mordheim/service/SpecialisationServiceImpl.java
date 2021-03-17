package co.trystan.mordheim.service;

import co.trystan.mordheim.repository.SpecialisationRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@Service
public class SpecialisationServiceImpl implements SpecialisationService {

    SpecialisationRepository specialisationRepository;
}
