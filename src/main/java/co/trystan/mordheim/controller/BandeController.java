package co.trystan.mordheim.controller;

import co.trystan.mordheim.model.Bande;
import co.trystan.mordheim.model.Joueur;
import co.trystan.mordheim.model.Race;
import co.trystan.mordheim.repository.BandeRepository;
import co.trystan.mordheim.repository.JoueurRepository;
import co.trystan.mordheim.service.BandeService;
import co.trystan.mordheim.service.JoueurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/mordheim")
public class BandeController {

    @Autowired
    BandeService bandeService;
    BandeRepository bandeRepository;
    JoueurService joueurService;

    /**
     * Récuperer tout les bandes
     * @return Une liste de bande
     */

    @GetMapping("/mesbandes")
    ResponseEntity<List<Bande>> getAllBande(@RequestParam(name = "page", defaultValue = "0") int page,
                                            @RequestParam(name = "size", defaultValue = "10") int size){
        List<Bande> listBande;
        listBande = bandeService.findAll(page, size);
        if (listBande.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(listBande);
    }

    @GetMapping("/mesbandes/{id}")
    ResponseEntity<Bande> getBandeById(@PathVariable(value = "id") Long id) {
        Bande bande = bandeService.findById(id);
        if (bande == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(bande);
    }

    //Récuper l'id du joueur et de la race pour attribuer a la bande le joueur et la race
    @PostMapping("/bandes")
    ResponseEntity<Bande> addBande(@RequestBody Bande bande) {
        //Long joueurId = bande.getJoueurId();
        //Joueur joueur = joueurService.findById(joueurId);
        //bande.setJoueur(joueur);
        //System.out.println(bande.getJoueurId());
        return ResponseEntity.ok(bandeService.insert(bande));
    }


    @PutMapping("/bandes/{id}")
    ResponseEntity<Bande> updateBande(@PathVariable(value = "id")Long id, @RequestBody Bande bande) {
        Bande updateBande = bandeService.update(id, bande);
        if (updateBande == null) {
            ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(updateBande);
    }


    @DeleteMapping("bandes/{id}")
    ResponseEntity<Bande> deleteBande(@PathVariable(value = "id")Long id) {
        Bande bande = bandeService.findById(id);
        if (bande == null){
            return ResponseEntity.notFound().build();
        }
        bandeService.delete(bande.getId());
        return ResponseEntity.accepted().build();
    }



/*    @PostMapping("/bandes/race/{idrace}/joueur/{idjoueur}")
    ResponseEntity<Bande> addBande(@PathVariable("idjoueur") int idjoueur,
                               @PathVariable("idrace") int idrace) {
        Bande bande = new Bande();
        bande.setJoueur(idjoueur);
        joueurService.findById();
        bande.setRace(idrace);
        bande.setName("Ma quatrième bande");
        bandeRepository.save(bande);

        if(bande == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(bande);
    }*/
}
