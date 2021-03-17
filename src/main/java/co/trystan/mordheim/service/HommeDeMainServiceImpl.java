package co.trystan.mordheim.service;

import co.trystan.mordheim.repository.HommeDeMainRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@Service
public class HommeDeMainServiceImpl implements HommeDeMainService {

    HommeDeMainRepository hommeDeMainRepository;
}
