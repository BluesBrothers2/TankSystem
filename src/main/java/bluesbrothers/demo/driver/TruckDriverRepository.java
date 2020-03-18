package bluesbrothers.demo.driver;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TruckDriverRepository extends JpaRepository<TruckDriver, Long> {

}
