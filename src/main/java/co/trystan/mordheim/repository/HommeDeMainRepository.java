package co.trystan.mordheim.repository;

import co.trystan.mordheim.model.HommeDeMain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HommeDeMainRepository extends JpaRepository<HommeDeMain, Long> {
}
