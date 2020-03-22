package bluesbrothers.demo.truck.mvc;

import bluesbrothers.demo.truck.entity.Truck;
import bluesbrothers.demo.truck_driver.entity.TruckDriver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TruckRepository extends JpaRepository<Truck, Long> {

}
