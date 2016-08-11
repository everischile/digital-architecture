package com.everis.ideaton.domain;

import lombok.Builder;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Builder
public final class Image {

    @Id
    private final String id;
    private final String link;

    public Image() {
        this.id = null;
        this.link = null;
    }

    private Image(String id, String link) {
        this.id = id;
        this.link = link;
    }

    public static Image createImageInstance(String id, String link){
        return new Image(id, link);
    }

    public String getId() {
        return id;
    }

    public String getLink() {
        return link;
    }
}
