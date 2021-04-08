package co.trystan.mordheim.repository;

import co.trystan.mordheim.model.Race;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

@DataJpaTest
public class RaceRepositoryTest {

    @Autowired
    private TestEntityManager testEntityManager;

    @Autowired
    RaceRepository raceRepository;

    @DisplayName("trouver toute les races")
    @Test
    public void findAllTest() {
        //GIVEN
        Race RaceElfe = new Race(1L,"elfe");
        Race RaceOrc = new Race(2L,"orc");

        //WHEN
        List<Race> raceSelect = raceRepository.findAll();

        //THEN

        assertThat(raceSelect.size()).isEqualTo(2);
    }
}
