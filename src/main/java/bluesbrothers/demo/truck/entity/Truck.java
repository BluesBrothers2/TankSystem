package bluesbrothers.demo.truck.entity;

import bluesbrothers.demo.truck_driver.entity.TruckDriver;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "trucks")
public class Truck {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    private String plate;

    @OneToOne(mappedBy = "truck")
    @JsonIgnore
    private TruckDriver driver;

    public Truck() {
    }

    public long getId() {
        return id;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public TruckDriver getDriver() {
        return driver;
    }

    public void setDriver(TruckDriver driver) {
        this.driver = driver;
    }


}
