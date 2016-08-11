package com.everis.ideaton.domain.dto;

public final class CommentaryDto {

    private final String postedByUserId;
    private final String text;

    private CommentaryDto(String postedByUserId, String text) {
        this.postedByUserId = postedByUserId;
        this.text = text;
    }

    public static CommentaryDto createCommentaryDtoInstance(String postedByUserId, String text){
        return new CommentaryDto(postedByUserId, text);
    }

    public String getPostedByUserId() {
        return postedByUserId;
    }

    public String getText() {
        return text;
    }
}
