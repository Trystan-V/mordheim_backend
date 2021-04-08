package co.trystan.mordheim.controller;

import co.trystan.mordheim.model.Bande;
import co.trystan.mordheim.model.Joueur;
import co.trystan.mordheim.service.JoueurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/mordheim")
public class JoueurController {

    @Autowired
    JoueurService joueurService;

    @GetMapping("/joueurs/{id}")
    ResponseEntity<Joueur> getJoueurById(@PathVariable(value = "id") Long id) {
        Joueur joueur = joueurService.findById(id);
        if (joueur == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(joueur);
    }

    @GetMapping("/joueurs")
    ResponseEntity<List<Joueur>> getAllJoueur(){
        List<Joueur> joueurList;
        joueurList = joueurService.findAll();
        if (joueurList.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(joueurList);
    }
}
