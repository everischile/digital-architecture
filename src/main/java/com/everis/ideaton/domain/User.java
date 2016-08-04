package com.everis.ideaton.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigInteger;

@Document
final public class User {

    @Id
    private final BigInteger  id;
    private final String firstName;
    private final String lastName;
    private final String email;
    private final String city;
    private final String country;
    private final String region;
    private final String signedWith;

    public User() {
        signedWith = null;
        region = null;
        country = null;
        city = null;
        email = null;
        lastName = null;
        firstName = null;
        id = null;
    }

    private User(BigInteger  id, String firstName, String lastName, String email, String city, String country,
                 String region, String signedWith) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.city = city;
        this.country = country;
        this.region = region;
        this.signedWith = signedWith;
    }

    public static User createBookInstance(BigInteger  id, String firstName, String lastName, String email, String city,
                                          String country, String region, String signedWith){
        return new  User(id, firstName, lastName, email, city, country, region, signedWith);
    }

    public BigInteger getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public String getRegion() {
        return region;
    }

    public String getSignedWith() {
        return signedWith;
    }
}
