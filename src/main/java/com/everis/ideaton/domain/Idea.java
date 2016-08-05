package com.everis.ideaton.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigInteger;
import java.util.List;

@Document
public final class Idea {

    @Id
    private final BigInteger id;
    private final String title;
    private final String description;
    private final Category category;
    private final User uploadedBy;
    private final List<User> members;
    private final Video video;
    private final List<Image> images;
    private final List<Like> likes;

    public Idea() {
        id = null;
        title = null;
        description = null;
        category = null;
        uploadedBy = null;
        members = null;
        video = null;
        images = null;
        likes = null;
    }

    private Idea(BigInteger id, String title, String description, Category category, User uploadedBy, List<User> members,
                 Video video, List<Image> images, List<Like> likes) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.category = category;
        this.uploadedBy = uploadedBy;
        this.members = members;
        this.video = video;
        this.images = images;
        this.likes = likes;
    }

    public static Idea createIdeaInstance(BigInteger id, String title, String description, Category category,
                                          User uploadedBy, List<User> members, Video video, List<Image> images,
                                          List<Like> likes){
        return new Idea(id, title, description, category, uploadedBy, members, video, images, likes);
    }

    public BigInteger getId() {
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

    public List<User> getMembers() {
        return members;
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
}
