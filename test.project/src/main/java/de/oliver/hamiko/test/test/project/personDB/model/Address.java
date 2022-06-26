package de.oliver.hamiko.test.test.project.personDB.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@Entity
public class Address {

    @Id
    @GeneratedValue
    private Integer id;
    @NotEmpty
    private String street;
    @NotEmpty
    private String streetNr;
    @NotEmpty
    private String zip;
    @NotEmpty
    private String city;
    @NotEmpty
    public Address() {
    }

    public Address(String street, String streetNr, String zip, String city) {
        this.street = street;
        this.streetNr = streetNr;
        this.zip = zip;
        this.city = city;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreetNr() {
        return streetNr;
    }

    public void setStreetNr(String streetNr) {
        this.streetNr = streetNr;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", street='" + street + '\'' +
                ", streetNr='" + streetNr + '\'' +
                ", zip='" + zip + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
