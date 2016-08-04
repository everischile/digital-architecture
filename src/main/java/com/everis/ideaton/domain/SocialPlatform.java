package com.everis.ideaton.domain;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public enum SocialPlatform {
    FACEBOOK("Facebook"), LINKEDIN("Linkedin"), GOOGLE("Google");

    private final String socialValue;

    private SocialPlatform(String socialValue){
        this.socialValue = socialValue;
    }

    public String getSocialValue() {
        return socialValue;
    }
}
