package com.everis.ideaton.domain;

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
