package co.trystan.mordheim.service;

import co.trystan.mordheim.repository.HerosRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@Service
public class HerosServiceImpl implements HerosService {

    HerosRepository herosRepository;
}
