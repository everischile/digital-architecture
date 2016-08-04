package com.everis.ideaton.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public final class Image {

    @Id
    private final Long id;
    private final String link;

    public Image() {
        id = null;
        link = null;
    }

    private Image(Long id, String link) {
        this.id = id;
        this.link = link;
    }

    public static Image createImageInstance(Long id, String link){
        return new Image(id, link);
    }
}
