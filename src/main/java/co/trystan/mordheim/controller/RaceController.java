package co.trystan.mordheim.controller;

import co.trystan.mordheim.model.Race;
import co.trystan.mordheim.service.BandeService;
import co.trystan.mordheim.service.RaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/mordheim")
public class RaceController {

    @Autowired
    RaceService raceService;

    @Autowired
    BandeService bandeService;

    @GetMapping("/races/{id}")
    ResponseEntity<Race> getRaceById(@PathVariable(value = "id")Long id) {
        Optional<Race> race = raceService.findById(id);
        if (race.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(race.get());
    }

    @GetMapping("/races")
    ResponseEntity<List<Race>> getAllRace(@RequestParam(value = "search", defaultValue = "")String search) {
        List<Race> listRace;
        try {
            listRace = raceService.findAll(search);
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(listRace);
    }

    @PostMapping("/races")
    ResponseEntity<Race> addRace(@Validated @RequestBody Race race) {
        return ResponseEntity.ok().body(raceService.insert(race));
    }


    @PutMapping("/races/{id}")
    ResponseEntity<Race> updateRace(@PathVariable(value = "id")Long id, @RequestBody Race race) {
        Race updateRace = raceService.update(id, race);
        if (updateRace == null) {
            ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(updateRace);
    }

    @DeleteMapping("races/{id}")
    ResponseEntity<Race> deleteRace(@PathVariable(value = "id")Long id) {
        Optional<Race> race = raceService.findById(id);
        if (race.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        raceService.delete(race.get().getId());
        return ResponseEntity.accepted().build();
    }


}
