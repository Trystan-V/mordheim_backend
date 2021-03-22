package co.trystan.mordheim.controller;

import co.trystan.mordheim.model.Blessure;
import co.trystan.mordheim.service.BlessureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/mordheim")
public class BlessureController {

    @Autowired
    BlessureService blessureService;

    @CrossOrigin
    @GetMapping("/blessures/{id}")
    ResponseEntity<Blessure> getBlessureById(@RequestParam(value = "id")Long id){
        Optional<Blessure> blessure = blessureService.findById(id);
        if (blessure.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(blessure.get());
    }

    @CrossOrigin
    @GetMapping("/blessures")
    ResponseEntity<List<Blessure>> getAllBlessure(){
        List<Blessure> listBlessure;
        listBlessure = blessureService.findAll();
        if (listBlessure.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(listBlessure);
    }

    @CrossOrigin
    @PostMapping
    ResponseEntity<Blessure> addBlessure(@RequestBody Blessure blessure) {
        return ResponseEntity.ok().body(blessureService.insert(blessure));
    }
}
