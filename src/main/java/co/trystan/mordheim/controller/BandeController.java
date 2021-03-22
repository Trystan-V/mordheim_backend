package co.trystan.mordheim.controller;

import co.trystan.mordheim.model.Bande;
import co.trystan.mordheim.service.BandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/mordheim")
public class BandeController {

    @Autowired
    BandeService bandeService;

    @CrossOrigin
    @GetMapping("/mesbandes")
    ResponseEntity<List<Bande>> getAllBande(){
        List<Bande> listBande;
        listBande = bandeService.findAll();
        if (listBande.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(listBande);
    }


    @CrossOrigin
    @GetMapping("/mesbandes/{id}")
    ResponseEntity<Bande> getBandeById(@PathVariable(value = "id") Long id) {
        Optional<Bande> bande = bandeService.findById(id);
        if (bande.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(bande.get());
    }

    @CrossOrigin
    @PostMapping("/bandes")
    ResponseEntity<Bande> addBande(@RequestBody Bande bande) {
        return ResponseEntity.ok().body(bandeService.insert(bande));
    }

    @CrossOrigin
    @PutMapping("/bandes/{id}")
    ResponseEntity<Bande> updateBande(@PathVariable(value = "id")Long id, @RequestBody Bande bande) {
        Bande updateBande = bandeService.update(id, bande);
        if (updateBande == null) {
            ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(updateBande);
    }

    @CrossOrigin
    @DeleteMapping("bandes/{id}")
    ResponseEntity<Bande> deleteBande(@PathVariable(value = "id")Long id) {
        Optional<Bande> bande = bandeService.findById(id);
        if (bande.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        bandeService.delete(bande.get().getId());
        return ResponseEntity.accepted().build();
    }
}
