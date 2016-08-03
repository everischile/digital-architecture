package com.everis.ideaton.domain;

final public class User {

    private final Long id;
    private final String firstName;
    private final String lastName;
    private final String email;
    private final String city;
    private final String country;
    private final String region;
    private final SocialPlatform signedWith;

    private User(Long id, String firstName, String lastName, String email, String city, String country,
                        String region, SocialPlatform signedWith) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.city = city;
        this.country = country;
        this.region = region;
        this.signedWith = signedWith;
    }

    public static User createBookInstance(Long id, String firstName, String lastName, String email, String city,
                                          String country, String region, SocialPlatform signedWith){
        return new  User(id, firstName, lastName, email, city, country, region, signedWith);
    }

    public Long getId() {
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
}
