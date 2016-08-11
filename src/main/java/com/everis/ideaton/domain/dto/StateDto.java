package com.everis.ideaton.domain.dto;

import com.everis.ideaton.domain.StateType;

public final class StateDto {

    private final StateType state;
    private final String approvedByUserId;

    private StateDto(StateType state, String approvedByUserId) {
        this.state = state;
        this.approvedByUserId = approvedByUserId;
    }

    public static StateDto createStateDtoInstance(StateType state, String approvedByUserId){
        return new StateDto(state, approvedByUserId);
    }

    public StateType getState() {
        return state;
    }

    public String getApprovedByUserId() {
        return approvedByUserId;
    }
}
