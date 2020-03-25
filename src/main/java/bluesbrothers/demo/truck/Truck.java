package bluesbrothers.demo.truck;


import bluesbrothers.demo.driver.Driver;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "trucks")
public class Truck {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String mark;
    @NotNull
    private String model;
    @Size(min = 17, max = 17)
    private String VIN;

    private String plate;
    @OneToMany(mappedBy = "truck")
    @JsonIgnore
    private List<Driver> truckDrivers;

    @OneToOne(mappedBy = "truck")
    private SemiTrailer semiTrailer;

    public Truck() {
    }

    public Truck(@NotNull String mark, @NotNull String model, @Size(min = 17, max = 17) String VIN, String plate, List<Driver> truckDrivers, SemiTrailer semiTrailer) {
        this.mark = mark;
        this.model = model;
        this.VIN = VIN;
        this.plate = plate;
        this.truckDrivers = truckDrivers;
        this.semiTrailer = semiTrailer;
    }

    public Long getId() {
        return id;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVIN() {
        return VIN;
    }

    public void setVIN(String VIN) {
        this.VIN = VIN;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public SemiTrailer getSemiTrailer() {
        return semiTrailer;
    }

    public void setSemiTrailer(SemiTrailer semiTrailer) {
        this.semiTrailer = semiTrailer;
    }

    public List<Driver> getTruckDrivers() {
        return truckDrivers;
    }

    public void setTruckDrivers(List<Driver> truckDrivers) {
        this.truckDrivers = truckDrivers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Truck truck = (Truck) o;
        return Objects.equals(id, truck.id) &&
                Objects.equals(mark, truck.mark) &&
                Objects.equals(model, truck.model) &&
                Objects.equals(VIN, truck.VIN) &&
                Objects.equals(plate, truck.plate) &&
                Objects.equals(truckDrivers, truck.truckDrivers) &&
                Objects.equals(semiTrailer, truck.semiTrailer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, mark, model, VIN, plate, truckDrivers, semiTrailer);
    }
}
