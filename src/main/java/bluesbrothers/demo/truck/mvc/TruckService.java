package bluesbrothers.demo.truck.mvc;

import bluesbrothers.demo.truck.entity.Truck;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TruckService {

    private final TruckRepository truckRepository;

    @Autowired
    public TruckService(TruckRepository truckRepository) {
        this.truckRepository = truckRepository;
    }

    public Truck add(Truck truck) {
        return truckRepository.save(truck);
    }
}
