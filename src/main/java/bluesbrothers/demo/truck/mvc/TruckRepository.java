package bluesbrothers.demo.truck.mvc;

import bluesbrothers.demo.truck.entity.TruckModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TruckRepository extends JpaRepository<TruckModel, Long> {

}
