package bluesbrothers.demo.truck_driver.mvc;

import bluesbrothers.demo.truck_driver.entity.TruckDriverModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TruckDriverRepository extends JpaRepository<TruckDriverModel, Long> {

    Optional<TruckDriverModel> findByLogin(int login);
}
