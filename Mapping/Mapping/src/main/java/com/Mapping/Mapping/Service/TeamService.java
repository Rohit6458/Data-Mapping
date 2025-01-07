package com.Mapping.Mapping.Service;

import org.modelmapper.ModelMapper;
import com.Mapping.Mapping.DTO.TeamDTO;
import com.Mapping.Mapping.Entity.Team;
import com.Mapping.Mapping.Repository.TeamReposistory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamService {

    @Autowired
    ModelMapper modelMapper;

    @Autowired
    TeamReposistory teamReposistory;
    public void create(TeamDTO teamDTO) {
        Team team =modelMapper.map(teamDTO,Team.class);
        teamReposistory.save(team);
    }

    public List<Team> getAllTeam() {
        return teamReposistory.findAll();
    }
}
