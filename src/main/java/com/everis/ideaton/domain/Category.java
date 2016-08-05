package com.everis.ideaton.domain;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public enum Category {

    ENTRETENCION("Entretencion"), EDUCACION("Educacion"), TRNSPORTE_Y_ACCESIBILIDAD("Transporte y accesibilidad"),
    TRABAJO("Trabajo"), COMUNICACIONES("Comunicaciones"), VIDA_DIARIA("Vida diaria");

    private final String categoryType;

    Category(String categoryType) {
        this.categoryType = categoryType;
    }

    public String getCategoryType() {
        return categoryType;
    }
}
