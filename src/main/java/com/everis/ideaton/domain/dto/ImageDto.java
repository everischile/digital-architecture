package com.everis.ideaton.domain.dto;

public final class ImageDto {

    private final String link;

    private ImageDto(String link) {
        this.link = link;
    }

    public static ImageDto createImageDtoInstance(String link){
        return new ImageDto(link);
    }

    public String getLink() {
        return link;
    }
}
