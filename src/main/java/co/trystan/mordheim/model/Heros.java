package co.trystan.mordheim.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class Heros extends Personnage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;

/*    @OneToMany(mappedBy = "heros")
    @JsonManagedReference
    private List<Blessure> blessures;*/

}
