package com.everis.ideaton.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public final class Like {

    @Id
    private final Long id;
    private final User user;
    private final SocialPlatform votedWith;

    public Like() {
        id = null;
        user = null;
        votedWith = null;
    }

    private Like(Long id, User user, SocialPlatform votedWith) {
        this.id = id;
        this.user = user;
        this.votedWith = votedWith;
    }

    public static Like createLikeInstance(Long id, User user, SocialPlatform votedWith){
        return new Like(id, user, votedWith);
    }
}
