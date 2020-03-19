package bluesbrothers.demo.driver.assist_classes;

import bluesbrothers.demo.driver.mvc.TruckDriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class LoginGenerator {

    private final TruckDriverRepository driverRepository;

    @Autowired
    public LoginGenerator(TruckDriverRepository driverRepository) {
        this.driverRepository = driverRepository;
    }

    public int generateUnique() {
        int login = generator();
        if (driverRepository.findByLogin(login).isPresent()) {
            generateUnique();
        }
        return login;
    }

    private int generator() {
        int minValue = 1;
        int maxValue = 999999;
        Random random = new Random();
        return random.ints(minValue, (maxValue + 1))
                .findFirst()
                .getAsInt();
    }
}
