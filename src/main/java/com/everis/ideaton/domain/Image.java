package com.everis.ideaton.domain;

public final class Image {

    private final Long id;
    private final String link;

    private Image(Long id, String link) {
        this.id = id;
        this.link = link;
    }

    public static Image createImageInstance(Long id, String link){
        return new Image(id, link);
    }
}
