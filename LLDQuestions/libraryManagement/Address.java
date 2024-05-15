package LLDQuestions.libraryManagement;

public class Address {
    private String street;
    private String district;
    private String state;
    private String country;
    private int pinCode;

    public Address() {
        this.street = "street";
        this.district = "district";
        this.state = "state";
        this.country = "country";
        this.pinCode = 111111;
    }

    public Address(String street, String district, String state, String country, int pinCode) {
        this.street = street;
        this.district = district;
        this.state = state;
        this.country = country;
        this.pinCode = pinCode;
    }

    public String printAddress() {
        StringBuilder sb = new StringBuilder();
        sb.append("street: " + street + "\n");
        sb.append("district: " + district + "\n");
        sb.append("state: " + state + "\n");
        sb.append("country: " + country + "\n");
        sb.append("pinCode: " + pinCode + "\n");
        //System.out.println(sb.toString());
        return sb.toString();
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }
}
