package com.everis.ideaton.domain;

import lombok.Builder;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Builder
public final class Video {

    @Id
    private final String id;
    private final String link;

    public Video() {
        this.id = null;
        this.link = null;
    }

    private Video(String id, String link) {
        this.id = id;
        this.link = link;
    }

    public static Video createVideoInstance(String id, String link){
        return new Video(id, link);
    }

    public String getId() {
        return id;
    }

    public String getLink() {
        return link;
    }
}
