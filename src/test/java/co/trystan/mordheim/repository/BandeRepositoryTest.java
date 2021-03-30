package co.trystan.mordheim.repository;

import co.trystan.mordheim.model.Bande;
import co.trystan.mordheim.model.Joueur;
import co.trystan.mordheim.model.Race;
import co.trystan.mordheim.repository.BandeRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

@ExtendWith(SpringExtension.class)
@DataJpaTest
public class BandeRepositoryTest {


    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private BandeRepository bandeRepository;

    @DisplayName("Trouve tout les bandes")
    @Test
    public void findAllTest() {
    // GIVEN
        Joueur trystan = new Joueur(1,"trystan","password");
        entityManager.persist(trystan);
        Race MercenaireMariumburger = new Race(1L,"Mercenaire Mariemburger");
        entityManager.persist(MercenaireMariumburger);
        Bande premiereBande = new Bande(1,"Ma premiere bande",trystan,MercenaireMariumburger);
        entityManager.persist(premiereBande);

     //WHEN
        List<Bande> bandesSelection = bandeRepository.findAll();

        //THEN
        assertThat(bandesSelection.get(1));
    }
}
