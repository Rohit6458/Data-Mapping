package com.Mapping.Mapping.Controller;

import com.Mapping.Mapping.DTO.TeamDTO;
import com.Mapping.Mapping.Entity.Team;
import com.Mapping.Mapping.Service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TeamController {

  @Autowired
  TeamService teamService;

    @PostMapping("/create/team")
    ResponseEntity<String> create(@RequestBody TeamDTO teamDTO){
        teamService.create(teamDTO);
        return new ResponseEntity<>("Created Sucessfully", HttpStatus.CREATED);
    }

    @GetMapping("/getTeam.json")
    ResponseEntity<List> getAllTeam(){
        List<Team> team=teamService.getAllTeam();
        return new ResponseEntity<>(team,HttpStatus.OK);
    }
}
