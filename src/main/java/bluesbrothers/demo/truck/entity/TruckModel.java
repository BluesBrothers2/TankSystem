package bluesbrothers.demo.truck.entity;

import bluesbrothers.demo.truck_driver.entity.TruckDriverModel;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "trucks")
public class TruckModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    private String plate;

    @OneToMany(mappedBy = "truck")
    @JsonIgnore
    private Set<TruckDriverModel> driver;

    public TruckModel() {
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

    public Set<TruckDriverModel> getDriver() {
        return driver;
    }

    public void setDriver(Set<TruckDriverModel> driver) {
        this.driver = driver;
    }
}
