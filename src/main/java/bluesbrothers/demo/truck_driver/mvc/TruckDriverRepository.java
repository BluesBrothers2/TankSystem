package bluesbrothers.demo.truck_driver.mvc;

import bluesbrothers.demo.truck.entity.Truck;
import bluesbrothers.demo.truck_driver.entity.TruckDriver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TruckDriverRepository extends JpaRepository<TruckDriver, Long> {

    Optional<TruckDriver> findByLogin(int login);
}
