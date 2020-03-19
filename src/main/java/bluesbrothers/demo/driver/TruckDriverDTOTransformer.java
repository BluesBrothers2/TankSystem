package bluesbrothers.demo.driver;

import bluesbrothers.demo.driver.entity.TruckDriver;
import bluesbrothers.demo.driver.entity.TruckDriverDTO;
import org.springframework.stereotype.Component;

@Component
public class TruckDriverDTOTransformer {

    public TruckDriverDTO toDTO(TruckDriver truckDriver){
        TruckDriverDTO truckDriverDTO = new TruckDriverDTO();
        truckDriverDTO.setFullName(truckDriver.getFirstName() + " " + truckDriver.getLastName());
        truckDriverDTO.setPhone(truckDriver.getPhoneNumber());
        truckDriverDTO.setTruck_trailer((truckDriver.getTruck() + "/" + truckDriver.getTrailer()));
        return truckDriverDTO;
    }
}
