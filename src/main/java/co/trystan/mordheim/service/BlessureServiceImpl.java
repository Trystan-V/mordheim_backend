package co.trystan.mordheim.service;

import co.trystan.mordheim.model.Blessure;
import co.trystan.mordheim.repository.BlessureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@Service
public class BlessureServiceImpl implements BlessureService{

    @Autowired
    private BlessureRepository blessureRepository;

    @Override
    public Optional<Blessure> findById(long id) {
        return blessureRepository.findById(id);
    }

    @Override
    public List<Blessure> findAll() {
        return blessureRepository.findAll();
    }

    @Override
    public Blessure insert(Blessure blessure) {
        return blessureRepository.save(blessure);
    }

    @Override
    public Blessure update(Long id, Blessure blessure) {
        Optional<Blessure> optionalBlessure = this.findById(id);

        if (optionalBlessure.isPresent()){
            Blessure blessureToUpdate = optionalBlessure.get();
            blessureToUpdate.setName(blessure.getName());
            return blessureRepository.save(blessureToUpdate);
        }
        return null;
    }

    @Override
    public Void delete(Long id) {
        Optional<Blessure> blessure = this.findById(id);
        if (blessure.isPresent()){
            blessureRepository.delete(blessure.get());
        }
        return null;
    }
}
