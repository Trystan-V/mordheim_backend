package co.trystan.mordheim.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Caracteristique {

    @Id
    private long id;

    private int mouvement;

    private int combat;

    private int tir;

    private int force;

    private int endurance;

    private int pointDeVie;

    private int initiative;

    private int attaque;

    private int commandement;
}
