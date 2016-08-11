package com.everis.ideaton.domain.dto;

public final class VideoDto {

    private final String link;

    private VideoDto(String link) {
        this.link = link;
    }

    public static VideoDto createVideoDtoInstance(String link){
        return new VideoDto(link);
    }

    public String getLink() {
        return link;
    }
}
