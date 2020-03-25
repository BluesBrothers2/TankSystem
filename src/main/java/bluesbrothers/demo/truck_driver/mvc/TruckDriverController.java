package bluesbrothers.demo.truck_driver.mvc;

import bluesbrothers.demo.truck_driver.entity.TruckDriverModel;
import bluesbrothers.demo.truck_driver.entity.TruckDriverDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/driver")
public class TruckDriverController {

    private final TruckDriverService truckDriverService;

    @Autowired
    public TruckDriverController(TruckDriverService truckDriverService) {
        this.truckDriverService = truckDriverService;
    }

    @PostMapping
    public TruckDriverModel addDriver(@RequestBody TruckDriverModel truckDriver){
        return truckDriverService.addDriver(truckDriver);
    }

    @GetMapping
    public List<TruckDriverDTO> getDrivers(){
        return truckDriverService.getAllDrivers();
    }

}
