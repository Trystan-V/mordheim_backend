package co.trystan.mordheim.model;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class Joueur {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String identifiant;

    private String password;

    
    public Joueur(long id, String identifiant, String password) {
        this.id = id;
        this.identifiant = identifiant;
        this.password = password;
    }

    public Joueur() {

    }
}
