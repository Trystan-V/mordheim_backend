package co.trystan.mordheim.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;

@Entity
public class Bande {

    @Id
    @Column(name = "idbande")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    public Bande(long id, String name, Joueur joueur, Race race) {
        this.id = id;
        this.name = name;
        this.joueur = joueur;
        this.race = race;
    }

    public Bande() {

    }

    public long getId(){
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Joueur getJoueur() {
        return joueur;
    }

    public void setJoueur(Joueur joueur) {
        this.joueur = joueur;
    }

    public Race getRace() {
        return race;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    @ManyToOne
    @JoinColumn(name = "idjoueur", referencedColumnName = "idjoueur", insertable = false, updatable = false, nullable = false)
    private Joueur joueur;

    @ManyToOne
    @JoinColumn(name = "idrace", referencedColumnName = "idrace", insertable = false, updatable = false, nullable = false)
    private Race race;

    @Column(name = "idjoueur")
    private Long joueurid;

    @Column(name = "idrace")
    private Long raceid;

}
