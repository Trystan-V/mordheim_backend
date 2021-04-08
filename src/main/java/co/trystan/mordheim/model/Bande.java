package co.trystan.mordheim.model;

import javax.persistence.*;

@Entity
public class Bande {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "joueur_id", referencedColumnName = "id", insertable = false, updatable = false, nullable = false)
    private Joueur joueur;

    @ManyToOne
    @JoinColumn(name = "race_id", referencedColumnName = "id", insertable = false, updatable = false, nullable = false)
    private Race race;

    @Column(name = "joueur_id")
    private Long joueurId;

    @Override
    public String toString() {
        return "Bande{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", joueur=" + joueur +
                ", race=" + race +
                ", joueurId=" + joueurId +
                ", raceId=" + raceId +
                '}';
    }

    @Column(name = "race_id")
    private Long raceId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Joueur getJoueur() {
        return joueur;
    }

    public void setJoueur(Joueur joueur) {
        this.joueur = joueur;
    }

    public Race getRace() {
        return race;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    public Long getJoueurId() {
        return joueurId;
    }

    public void setJoueurId(Long joueurId) {
        this.joueurId = joueurId;
    }

    public Long getRaceId() {
        return raceId;
    }

    public void setRaceId(Long raceId) {
        this.raceId = raceId;
    }
}
