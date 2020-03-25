package bluesbrothers.demo.input_correction;

import bluesbrothers.demo.truck_driver.entity.TruckDriverModel;

public abstract class TruckDriverInputCorrection implements InputCorrection<TruckDriverModel>{

    @Override
    public TruckDriverModel correctInputBeforeSave(TruckDriverModel driver) {
        driver.setFirstName(upperFistLetter(driver.getFirstName()));
        driver.setLastName(upperFistLetter(driver.getLastName()));
        driver.setDriversId(driver.getDriversId().toUpperCase());
        driver.setTrailer(driver.getTrailer()
                .replaceAll("\\s+", "")
                .toUpperCase());
        return driver;
    }

}
