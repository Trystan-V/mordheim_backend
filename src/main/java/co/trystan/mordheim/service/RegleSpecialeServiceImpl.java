package co.trystan.mordheim.service;

import co.trystan.mordheim.repository.RegleSpecialeRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@Service
public class RegleSpecialeServiceImpl  implements RegleSpecialeService {

    RegleSpecialeRepository regleSpecialeRepository;
}
