package bluesbrothers.demo.truck;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Objects;

@Entity(name = "semi_trailers")
public class SemiTrailer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String mark;
    @NotNull
    private String model;
    @Size(min = 17, max = 17)
    private String VIN;
    @Size(min = 1, max = 3)
    private Integer axles;
    @Size(min = 1, max = 5)
    private Integer chambers;
    @Size(max = 80)
    private Integer capacity;
    @OneToOne(mappedBy = "semiTrailer")
    private Truck truck;

    public SemiTrailer() {
    }

    public SemiTrailer(@NotNull String mark, @NotNull String model, @Size(min = 17, max = 17) String VIN, @Size(min = 1, max = 3) Integer axles, @Size(min = 1, max = 5) Integer chambers, @Size(max = 80) Integer capacity, Truck truck) {
        this.mark = mark;
        this.model = model;
        this.VIN = VIN;
        this.axles = axles;
        this.chambers = chambers;
        this.capacity = capacity;
        this.truck = truck;
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

    public Integer getAxles() {
        return axles;
    }

    public void setAxles(Integer axles) {
        this.axles = axles;
    }

    public Integer getChambers() {
        return chambers;
    }

    public void setChambers(Integer chambers) {
        this.chambers = chambers;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public Truck getTruck() {
        return truck;
    }

    public void setTruck(Truck truck) {
        this.truck = truck;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SemiTrailer that = (SemiTrailer) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(mark, that.mark) &&
                Objects.equals(model, that.model) &&
                Objects.equals(VIN, that.VIN) &&
                Objects.equals(axles, that.axles) &&
                Objects.equals(chambers, that.chambers) &&
                Objects.equals(capacity, that.capacity) &&
                Objects.equals(truck, that.truck);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, mark, model, VIN, axles, chambers, capacity, truck);
    }
}
