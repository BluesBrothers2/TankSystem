package bluesbrothers.demo.driver;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/driver")
public class TruckDriverController {

    private final TruckDriverService truckDriverService;

    public TruckDriverController(TruckDriverService truckDriverService) {
        this.truckDriverService = truckDriverService;
    }

    @PostMapping
    public TruckDriver addDriver(@RequestBody TruckDriver truckDriver){
        return truckDriverService.addDriver(truckDriver);
    }

    @GetMapping
    public List<TruckDriverDTO> getDrivers(){
        return truckDriverService.getAllDrivers();
    }
}
