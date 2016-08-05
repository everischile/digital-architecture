package com.everis.ideaton.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigInteger;

@Document
public final class Image {

    @Id
    private final BigInteger id;
    private final String link;

    public Image() {
        id = null;
        link = null;
    }

    private Image(BigInteger id, String link) {
        this.id = id;
        this.link = link;
    }

    public static Image createImageInstance(BigInteger id, String link){
        return new Image(id, link);
    }

    public BigInteger getId() {
        return id;
    }

    public String getLink() {
        return link;
    }
}
