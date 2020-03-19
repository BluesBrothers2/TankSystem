package bluesbrothers.demo.driver.entity;

public class TruckDriverDTO {

    private String fullName;
    private int phone;
    private String truck_trailer;

    public TruckDriverDTO() {
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
