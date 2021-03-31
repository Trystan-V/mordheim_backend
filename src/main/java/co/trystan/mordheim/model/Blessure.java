package co.trystan.mordheim.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Blessure {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

/*    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "idheros")
    private Heros heros;*/
}
