package co.trystan.mordheim.service;

import co.trystan.mordheim.repository.JoueurRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@Service
public class JoueurServiceImpl implements JoueurService {

    JoueurRepository joueurRepository;
}
