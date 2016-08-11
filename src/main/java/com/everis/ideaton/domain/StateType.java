package com.everis.ideaton.domain;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public enum StateType {

    APPROVED("Approved"), REJECTED("Rejected"), PENDING("Pending");

    private final String stateTipe;

    StateType(String stateTipe) {
        this.stateTipe = stateTipe;
    }

    public String getStateTipe() {
        return stateTipe;
    }
}
