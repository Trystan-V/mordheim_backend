package co.trystan.mordheim.service;

import co.trystan.mordheim.repository.BlessureRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@Service
public class BlessureServiceImpl implements BlessureService{

    BlessureRepository blessureRepository;
}
