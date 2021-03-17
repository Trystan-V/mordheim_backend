package co.trystan.mordheim.service;

import co.trystan.mordheim.repository.BandeRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@Service
public class BandeServiceImpl implements BandeService{

    BandeRepository bandeRepository;
}
