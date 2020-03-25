package bluesbrothers.demo.truck.mvc;

import bluesbrothers.demo.input_correction.TruckInputCorrection;
import bluesbrothers.demo.truck.entity.TruckModel;
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

    public TruckModel add(TruckModel truck) {
        return truckRepository.save(correctInputBeforeSave(truck));
    }

    public List<TruckModel> getAll() {
        return truckRepository.findAll();
    }
}
