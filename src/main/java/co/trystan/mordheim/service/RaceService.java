package co.trystan.mordheim.service;

import co.trystan.mordheim.model.Race;

import java.util.List;
import java.util.Optional;

public interface RaceService {
    Optional<Race> findById(Long id);

    List<Race> findAll();

    Race insert(Race race);

    Race update(Long id, Race race);

    void delete(Long id);
}
