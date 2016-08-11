package com.everis.ideaton.domain;

import lombok.Builder;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Builder
public final class Like {

    @Id
    private final String id;
    private final User user;
    private final SocialPlatform votedWith;

    public Like() {
        this.id = null;
        this.user = null;
        this.votedWith = null;
    }

    private Like(String id, User user, SocialPlatform votedWith) {
        this.id = id;
        this.user = user;
        this.votedWith = votedWith;
    }

    public static Like createLikeInstance(String id, User user, SocialPlatform votedWith){
        return new Like(id, user, votedWith);
    }

    public String getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public SocialPlatform getVotedWith() {
        return votedWith;
    }
}
