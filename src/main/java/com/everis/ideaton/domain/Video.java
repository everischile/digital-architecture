package com.everis.ideaton.domain;

public final class Video {
    private final Long id;
    private final String link;

    private Video(Long id, String link) {
        this.id = id;
        this.link = link;
    }

    public static Video createVideoInstance(Long id, String link){
        return new Video(id, link);
    }
}
