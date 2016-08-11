package com.everis.ideaton.domain.dto;

import com.everis.ideaton.domain.Category;

public final class IdeaDto {

    private final String title;
    private final String description;
    private final Category category;
    private final String uploadedById;

    private IdeaDto(String title, String description, Category category, String uploadedById) {
        this.title = title;
        this.description = description;
        this.category = category;
        this.uploadedById = uploadedById;
    }

    public static IdeaDto createIdeaDtoInstance(String title, String description, Category category, String uploadedById){
        return new IdeaDto(title, description, category, uploadedById);
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Category getCategory() {
        return category;
    }

    public String getUploadedById() {
        return uploadedById;
    }
}
