package co.trystan.mordheim.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class RegleSpeciale {

    @Id
    private long id;

    private String name;

    private String detail;
}
