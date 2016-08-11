package com.everis.ideaton.domain;

import lombok.Builder;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
@Builder
public final class Idea {

    @Id
    private final String id;
    private final String title;
    private final String description;
    private final Category category;
    private final User uploadedBy;
    private final Video video;
    private final List<Image> images;
    private final List<Like> likes;
    private final State state;
    private final String date;
    private final List<Commentary> comments;
    private final int totalVotes;

    public Idea() {
        this.totalVotes = 0;
        this.state = null;
        this.date = null;
        this.comments = null;
        this.id = null;
        this.title = null;
        this.description = null;
        this.category = null;
        this.uploadedBy = null;
        this.video = null;
        this.images = null;
        this.likes = null;
    }

    private Idea(String id, String title, String description, Category category, User uploadedBy,
                 Video video, List<Image> images, List<Like> likes, State state, String date, List<Commentary> comments, int totalVotes) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.category = category;
        this.uploadedBy = uploadedBy;
        this.video = video;
        this.images = images;
        this.likes = likes;
        this.state = state;
        this.date = date;
        this.comments = comments;
        this.totalVotes = totalVotes;
    }

    public static Idea createIdeaInstance(String id, String title, String description, Category category,
                                          User uploadedBy, Video video, List<Image> images,
                                          List<Like> likes, State state, String date, List<Commentary> comments, int totalVotes){
        return new Idea(id, title, description, category, uploadedBy, video, images, likes, state, date, comments, totalVotes);
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public User getUploadedBy() {
        return uploadedBy;
    }

    public Category getCategory() {
        return category;
    }

    public Video getVideo() {
        return video;
    }

    public List<Image> getImages() {
        return images;
    }

    public List<Like> getLikes() {
        return likes;
    }

    public State getState() {
        return state;
    }

    public String getDate() {
        return date;
    }

    public List<Commentary> getComments() {
        return comments;
    }

    public int getTotalVotes() {
        return totalVotes;
    }
}
