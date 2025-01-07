package com.Mapping.Mapping.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PlayerDTO {

    private String name;

    @JsonProperty("Team")
    private String TeamName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeamName() {
        return TeamName;
    }

    public void setTeamName(String teamName) {
        TeamName = teamName;
    }
}
