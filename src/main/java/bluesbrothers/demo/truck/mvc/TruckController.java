package bluesbrothers.demo.truck.mvc;

import bluesbrothers.demo.truck.entity.Truck;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/trucks")
public class TruckController {

    private final TruckService truckService;

    @Autowired
    public TruckController(TruckService truckService) {
        this.truckService = truckService;
    }

    @PostMapping("/add")
    public Truck addTruck(@RequestBody Truck truck) {
        return truckService.add(truck);
    }

    @GetMapping
    public List<Truck> getAll() {
        return truckService.getAll();
    }

}
