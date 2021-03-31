package co.trystan.mordheim.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
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

}
