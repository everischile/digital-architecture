package com.everis.ideaton.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public final class Video {

    @Id
    private final Long id;
    private final String link;

    public Video() {
        id = null;
        link = null;
    }

    private Video(Long id, String link) {
        this.id = id;
        this.link = link;
    }

    public static Video createVideoInstance(Long id, String link){
        return new Video(id, link);
    }
}
