package co.trystan.mordheim.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

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

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "idjoueur")
    private Joueur joueur;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "idrace")
    private Race race;

}
