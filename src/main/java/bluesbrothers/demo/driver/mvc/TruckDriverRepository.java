package bluesbrothers.demo.driver.mvc;

import bluesbrothers.demo.driver.entity.TruckDriver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TruckDriverRepository extends JpaRepository<TruckDriver, Long> {

}
