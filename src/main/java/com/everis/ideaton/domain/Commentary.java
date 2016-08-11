package com.everis.ideaton.domain;

import lombok.Builder;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Builder
public final class Commentary {

    @Id
    private final String id;
    private final User postedBy;
    private final User approvedBy;
    private final String text;
    private final String date;

    public Commentary() {
        this.id = null;
        this.postedBy = null;
        this.approvedBy = null;
        this.text = null;
        this.date = null;
    }


    private Commentary(String id, User postedBy, User approvedBy, String text, String date) {
        this.id = id;
        this.postedBy = postedBy;
        this.approvedBy = approvedBy;
        this.text = text;
        this.date = date;
    }

    public static Commentary createCommentaryInstance(String id, User postedBy, User approvedBy, String text, String date){
        return new Commentary(id, postedBy, approvedBy, text, date);
    }

    public String getId() {
        return id;
    }

    public User getPostedBy() {
        return postedBy;
    }

    public User getApprovedBy() {
        return approvedBy;
    }

    public String getText() {
        return text;
    }

    public String getDate() {
        return date;
    }
}
