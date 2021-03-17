package co.trystan.mordheim.service;

import co.trystan.mordheim.repository.EquipementRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@Service
public class EquipementServiceImpl implements EquipementService{

    EquipementRepository equipementRepository;
}
