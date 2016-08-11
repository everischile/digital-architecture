package com.everis.ideaton.domain;

import lombok.Builder;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Builder
final public class User {

    @Id
    private final String id;
    private final String firstName;
    private final String lastName;
    private final String email;
    private final String city;
    private final String country;
    private final String region;
    private final SocialPlatform signedWith;
    private final Role role;

    public User() {
        this.role = null;
        this.signedWith = null;
        this.region = null;
        this.country = null;
        this.city = null;
        this.email = null;
        this.lastName = null;
        this.firstName = null;
        this.id = null;
    }

    private User(String id, String firstName, String lastName, String email, String city, String country,
                 String region, SocialPlatform signedWith, Role role) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.city = city;
        this.country = country;
        this.region = region;
        this.signedWith = signedWith;
        this.role = role;
    }

    public static User createBookInstance(String  id, String firstName, String lastName, String email, String city,
                                          String country, String region, SocialPlatform signedWith, Role role){
        return new  User(id, firstName, lastName, email, city, country, region, signedWith, role);
    }

    public String getId() {
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

    public SocialPlatform getSignedWith() {
        return signedWith;
    }

    public Role getRole() {
        return role;
    }

}
