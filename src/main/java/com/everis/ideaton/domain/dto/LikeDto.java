package com.everis.ideaton.domain.dto;

import com.everis.ideaton.domain.SocialPlatform;

public final class LikeDto {

    private final String userId;
    private final SocialPlatform votedWith;

    private LikeDto(String userId, SocialPlatform votedWith) {
        this.userId = userId;
        this.votedWith = votedWith;
    }

    public static LikeDto createUserLikeDtoInstance(String userId, SocialPlatform votedWith){
        return new LikeDto(userId, votedWith);
    }

    public String getUserId() {
        return userId;
    }

    public SocialPlatform getVotedWith() {
        return votedWith;
    }
}
