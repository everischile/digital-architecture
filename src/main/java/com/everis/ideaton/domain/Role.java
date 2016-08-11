package com.everis.ideaton.domain;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public enum Role {

    SYSADMIN("Sys admin"), ADMIN("admin"), NORMAL("Normal user");

    private final String roleType;

    Role(String roleType) {
        this.roleType = roleType;
    }

    public String getStateTipe() {
        return roleType;
    }
}
