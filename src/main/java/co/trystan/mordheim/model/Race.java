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
public class Race {

    @Id
    @Column(name = "idrace")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    public Race(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    @OneToMany(mappedBy = "race")
    @JsonIgnore
    private List<Bande> bandes;


    public Race() {

    }
}
