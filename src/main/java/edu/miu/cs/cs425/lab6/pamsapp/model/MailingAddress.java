package edu.miu.cs.cs425.lab6.pamsapp.model;

public class MailingAddress {
    private String street;
    private String city;
    private String state;
    private String zipcode;

    public MailingAddress(String street, String city, String state, String zipcode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }

    public MailingAddress() {
        this(null, null, null, null);
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    @Override
    public String toString() {
        return String.format("MailingAddress{" +
                "street: %s," +
                "city: %s," +
                "state: %s," +
                "zipcode: %s}",
                street, city, state, zipcode);
    }
}
