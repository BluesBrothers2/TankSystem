package bluesbrothers.demo.truck_driver.mvc;

import bluesbrothers.demo.truck_driver.assist_classes.LoginGenerator;
import bluesbrothers.demo.truck_driver.entity.TruckDriver;
import bluesbrothers.demo.truck_driver.entity.TruckDriverDTO;
import bluesbrothers.demo.truck_driver.assist_classes.TruckDriverDTOTransformer;
import bluesbrothers.demo.truck_driver.assist_classes.TruckDriverInputCorrection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TruckDriverService extends TruckDriverInputCorrection {

    private final TruckDriverRepository truckDriverRepository;
    private final TruckDriverDTOTransformer truckDriverDTOTransformer;
    private final LoginGenerator loginGenerator;

    @Autowired
    public TruckDriverService(TruckDriverRepository truckDriverRepository,
                              TruckDriverDTOTransformer truckDriverDTOTransformer,
                              LoginGenerator loginGenerator) {
        this.truckDriverRepository = truckDriverRepository;
        this.truckDriverDTOTransformer = truckDriverDTOTransformer;
        this.loginGenerator = loginGenerator;
    }

    public TruckDriver addDriver(TruckDriver driver) {
        driver.setLogin(loginGenerator.generateUnique());
        return truckDriverRepository.save(correctInputBeforeSave(driver));
    }

    public List<TruckDriverDTO> getAllDrivers() {
        return truckDriverRepository.findAll().stream()
                .map(truckDriverDTOTransformer::toDTO)
                .collect(Collectors.toList());
    }

}
