package co.trystan.mordheim.service;

import co.trystan.mordheim.repository.RaceRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@Service
public class RaceServiceImpl implements RaceService {

    RaceRepository raceRepository;
}
