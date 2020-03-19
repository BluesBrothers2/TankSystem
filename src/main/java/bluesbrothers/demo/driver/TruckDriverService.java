package bluesbrothers.demo.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TruckDriverService extends TruckDriverInputCorrection {

    private final TruckDriverRepository truckDriverRepository;
    private final TruckDriverDTOTransformer truckDriverDTOTransformer;

    @Autowired
    public TruckDriverService(TruckDriverRepository truckDriverRepository,
                              TruckDriverDTOTransformer truckDriverDTOTransformer) {
        this.truckDriverRepository = truckDriverRepository;
        this.truckDriverDTOTransformer = truckDriverDTOTransformer;
    }

    public TruckDriver addDriver(TruckDriver driver) {
        return truckDriverRepository.save(correctInputBeforeSave(driver));
    }

    public List<TruckDriverDTO> getAllDrivers() {
        return truckDriverRepository.findAll().stream()
                .map(truckDriverDTOTransformer::toDTO)
                .collect(Collectors.toList());
    }

}
