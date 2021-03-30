package co.trystan.mordheim.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
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

    @OneToMany(mappedBy = "joueur")
    @JsonIgnore
    private List<Bande> bandes;

    public Joueur(long id, String identifiant, String password) {
        this.id = id;
        this.identifiant = identifiant;
        this.password = password;
    }

    public Joueur() {

    }
}
