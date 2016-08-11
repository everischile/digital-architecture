package com.everis.ideaton.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
final public class State {

    @Id
    private final String id;
    private final StateType state;
    private final User approvedBy;

    public State() {
        this.id = null;
        this.state = null;
        this.approvedBy = null;
    }

    private State(String id, StateType state, User approvedBy) {
        this.id = id;
        this.state = state;
        this.approvedBy = approvedBy;
    }

    public static State createStateInstance(StateType state, User approvedBy, String id){
        return new State(id, state, approvedBy);
    }

    public String getId() {
        return id;
    }

    public StateType getState() {
        return state;
    }

    public User getApprovedBy() {
        return approvedBy;
    }
}
