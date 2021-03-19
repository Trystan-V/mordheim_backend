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
}
