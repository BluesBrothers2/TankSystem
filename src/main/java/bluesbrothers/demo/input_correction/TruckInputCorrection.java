package bluesbrothers.demo.input_correction;

import bluesbrothers.demo.truck.entity.Truck;

public abstract class TruckInputCorrection implements InputCorrection<Truck>{

    @Override
    public Truck correctInputBeforeSave(Truck truck) {
        truck.setPlate(truck.getPlate()
                .replaceAll("\\s+", "")
                .toUpperCase());
        return truck;
    }

}
