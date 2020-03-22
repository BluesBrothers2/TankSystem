package bluesbrothers.demo.truck_driver.mvc;

import bluesbrothers.demo.truck.entity.Truck;
import bluesbrothers.demo.truck.mvc.TruckRepository;
import bluesbrothers.demo.truck_driver.assist_classes.LoginGenerator;
import bluesbrothers.demo.truck_driver.entity.TruckDriver;
import bluesbrothers.demo.truck_driver.entity.TruckDriverDTO;
import bluesbrothers.demo.truck_driver.assist_classes.TruckDriverDTOTransformer;
import bluesbrothers.demo.input_correction.TruckDriverInputCorrection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

@Service
public class TruckDriverService extends TruckDriverInputCorrection {

    private final TruckDriverRepository truckDriverRepository;
    private final TruckDriverDTOTransformer truckDriverDTOTransformer;
    private final TruckRepository truckRepository;
    private final LoginGenerator loginGenerator;

    @Autowired
    public TruckDriverService(TruckDriverRepository truckDriverRepository,
                              TruckDriverDTOTransformer truckDriverDTOTransformer,
                              TruckRepository truckRepository, LoginGenerator loginGenerator) {
        this.truckDriverRepository = truckDriverRepository;
        this.truckDriverDTOTransformer = truckDriverDTOTransformer;
        this.truckRepository = truckRepository;
        this.loginGenerator = loginGenerator;
    }

    //TODO: zrobić sprawdzenie przed zapisem, czy auto jest juz przypisane do jakiegos kierowcy.
    public TruckDriver addDriver(TruckDriver driver) {
        driver.setLogin(loginGenerator.generateUnique());
        Truck truck = truckRepository.findById(driver.getTruck().getId()).orElseThrow(NoSuchElementException::new);
        driver.setTruck(truck);
        return truckDriverRepository.save(correctInputBeforeSave(driver));
    }

    public List<TruckDriverDTO> getAllDrivers() {
        return truckDriverRepository.findAll().stream()
                .map(truckDriverDTOTransformer::toDTO)
                .collect(Collectors.toList());
    }

}
