package bluesbrothers.demo.truck_driver.entity;

public class TruckDriverDTO {

    private int login;
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

    public int getLogin() {
        return login;
    }

    public void setLogin(int login) {
        this.login = login;
    }
}
