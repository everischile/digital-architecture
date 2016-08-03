package com.everis.ideaton.domain;

public final class Like {

    private final Long id;
    private final User user;
    private final SocialPlatform votedWith;

    private Like(Long id, User user, SocialPlatform votedWith) {
        this.id = id;
        this.user = user;
        this.votedWith = votedWith;
    }

    public static Like createLikeInstance(Long id, User user, SocialPlatform votedWith){
        return new Like(id, user, votedWith);
    }
}
