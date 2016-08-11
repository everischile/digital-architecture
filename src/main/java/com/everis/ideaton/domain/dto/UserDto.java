package com.everis.ideaton.domain.dto;

import com.everis.ideaton.domain.SocialPlatform;

public final class UserDto {

    private final String firstName;
    private final String lastName;
    private final String email;
    private final String city;
    private final String country;
    private final String region;
    private final SocialPlatform signedWith;

    private UserDto(String firstName, String lastName, String email, String city, String country, String region,
                    SocialPlatform signedWith) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.city = city;
        this.country = country;
        this.region = region;
        this.signedWith = signedWith;
    }

    public static UserDto createUserDtoInstance(String firstName, String lastName, String email, String city,
                                                String country, String region, SocialPlatform signedWith){
        return new UserDto(firstName, lastName, email, city, country, region, signedWith);
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
}
