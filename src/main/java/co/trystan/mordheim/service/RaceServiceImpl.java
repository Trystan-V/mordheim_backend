package co.trystan.mordheim.service;

import co.trystan.mordheim.model.Race;
import co.trystan.mordheim.repository.RaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@Service
public class RaceServiceImpl implements RaceService {

    @Autowired
    private RaceRepository raceRepository;

    @Override
    public Optional<Race> findById(Long id) {
        return raceRepository.findById(id);
    }

    @Override
    public List<Race> findAll() {
            return raceRepository.findAll();
        }

    @Override
    public Race insert(Race race) {
        return raceRepository.save(race);
    }

    @Override
    public Race update(Long id, Race race) {
        Optional<Race> optionalRace = this.findById(id);

        if (optionalRace.isPresent()) {
            Race raceToUpdate = optionalRace.get();
            raceToUpdate.setName(race.getName());
            return raceRepository.save(raceToUpdate);
        }
        return null;
    }

    @Override
    public void delete(Long id) {
        Optional<Race> race = this.findById(id);
        if (race.isPresent()) {
            raceRepository.delete(race.get());
        }
    }
}
