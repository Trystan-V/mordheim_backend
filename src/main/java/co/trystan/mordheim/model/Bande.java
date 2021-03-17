package co.trystan.mordheim.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Bande {

    @Id
    @Column(name = "idbande")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "idjoueur")
    private Joueur joueur;

    @ManyToOne
    @JoinColumn(name = "idrace")
    private Race race;


}
