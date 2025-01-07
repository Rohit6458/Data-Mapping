package com.Mapping.Mapping.Service;


import com.Mapping.Mapping.DTO.PlayerDTO;
import com.Mapping.Mapping.Entity.Player;
import com.Mapping.Mapping.Entity.Team;
import com.Mapping.Mapping.Repository.PlayerReposistory;
import com.Mapping.Mapping.Repository.TeamReposistory;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {

    @Autowired
    ModelMapper modelMapper;

    @Autowired
    TeamReposistory teamReposistory;

    @Autowired
    TeamService teamService;

    @Autowired
    PlayerReposistory playerReposistory;
    public void addPlayer(PlayerDTO playerdto) {
        Team team=teamReposistory.findByName(playerdto.getTeamName());
        Player player=modelMapper.map(playerdto, Player.class);
        player.setTeamId(team);
        playerReposistory.save(player);
    }

    public List<Player> getAllPlayer() {
        List<Player> player=playerReposistory.findAll();
        return player;
    }
}
