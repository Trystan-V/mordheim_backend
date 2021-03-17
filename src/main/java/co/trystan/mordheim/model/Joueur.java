package co.trystan.mordheim.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class Joueur {

    @Id
    @Column(name = "idjoueur")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String identifiant;

    private String password;

//    @OneToMany(mappedBy = "joueur")
//    private List<Bande> bandes;

}
