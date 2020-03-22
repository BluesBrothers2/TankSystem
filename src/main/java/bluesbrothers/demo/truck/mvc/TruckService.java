package bluesbrothers.demo.truck.mvc;

import bluesbrothers.demo.input_correction.TruckInputCorrection;
import bluesbrothers.demo.truck.entity.Truck;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TruckService extends TruckInputCorrection {

    private final TruckRepository truckRepository;

    @Autowired
    public TruckService(TruckRepository truckRepository) {
        this.truckRepository = truckRepository;
    }

    public Truck add(Truck truck) {
        return truckRepository.save(correctInputBeforeSave(truck));
    }

    public List<Truck> getAll() {
        return truckRepository.findAll();
    }
}
