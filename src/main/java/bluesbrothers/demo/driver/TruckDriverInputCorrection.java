package bluesbrothers.demo.driver;

import bluesbrothers.demo.driver.entity.TruckDriver;

public abstract class TruckDriverInputCorrection {

    private String upperFistLetter(String text) {
        if (!Character.isUpperCase(text.charAt(0))) {
            return text.substring(0, 1).toUpperCase() + text.substring(1).toLowerCase();
        } else {
            return text;
        }
    }

    protected TruckDriver correctInputBeforeSave(TruckDriver driver) {
        driver.setFirstName(upperFistLetter(driver.getFirstName()));
        driver.setLastName(upperFistLetter(driver.getLastName()));
        driver.setDriversId(driver.getDriversId().toUpperCase());
        driver.setTruck(driver.getTruck()
                .replaceAll("\\s+", "")
                .toUpperCase());
        driver.setTrailer(driver.getTrailer()
                .replaceAll("\\s+", "")
                .toUpperCase());
        return driver;
    }

}
