package co.trystan.mordheim.service;

import co.trystan.mordheim.model.Blessure;

import java.util.List;
import java.util.Optional;

public interface BlessureService {
    Optional<Blessure> findById(long id);
    List<Blessure> findAll();
    Blessure insert(Blessure blessure);
    Blessure update(Long id, Blessure blessure);
    Void delete(Long id);

}
