package bluesbrothers.demo.driver;

public class TruckDriverDTO {

    private String fullName;
    private int phone;
    private String truck_trailer;
    private long id;

    public TruckDriverDTO() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getTruck_trailer() {
        return truck_trailer;
    }

    public void setTruck_trailer(String truck_trailer) {
        this.truck_trailer = truck_trailer;
    }
}
