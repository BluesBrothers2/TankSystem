package bluesbrothers.demo.truck_driver.assist_classes;

import bluesbrothers.demo.truck_driver.entity.TruckDriverModel;
import bluesbrothers.demo.truck_driver.entity.TruckDriverDTO;
import org.springframework.stereotype.Component;

@Component
public class TruckDriverDTOTransformer {

    public TruckDriverDTO toDTO(TruckDriverModel truckDriver){
        TruckDriverDTO truckDriverDTO = new TruckDriverDTO();
        truckDriverDTO.setLogin(truckDriver.getLogin());
        truckDriverDTO.setFullName(truckDriver.getFirstName() + " " + truckDriver.getLastName());
        truckDriverDTO.setPhone(truckDriver.getPhoneNumber());
        truckDriverDTO.setTruck_trailer((truckDriver.getTruck().getPlate() + "/" + truckDriver.getTrailer()));
        return truckDriverDTO;
    }
}
