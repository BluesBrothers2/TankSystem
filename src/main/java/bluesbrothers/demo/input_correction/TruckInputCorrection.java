package bluesbrothers.demo.input_correction;

import bluesbrothers.demo.truck.entity.TruckModel;

public abstract class TruckInputCorrection implements InputCorrection<TruckModel>{

    @Override
    public TruckModel correctInputBeforeSave(TruckModel truck) {
        truck.setPlate(truck.getPlate()
                .replaceAll("\\s+", "")
                .toUpperCase());
        return truck;
    }
}
