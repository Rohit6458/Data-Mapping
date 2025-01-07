package com.Mapping.Mapping.Controller;

import com.Mapping.Mapping.DTO.PlayerDTO;
import com.Mapping.Mapping.Entity.Player;
import com.Mapping.Mapping.Service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PlayerController {

    @Autowired
    PlayerService playerservice;

    @PostMapping("/addPlayer.json")
    ResponseEntity<String> addPlayer(@RequestBody PlayerDTO playerdto){
        playerservice.addPlayer(playerdto);
        return new ResponseEntity<>("Created Sucessfully", HttpStatus.CREATED);
    }

    @GetMapping("/getPlayer.json")
    ResponseEntity<List> getPlayer(){
        List<Player> player=playerservice.getAllPlayer();
        return new ResponseEntity<>(player, HttpStatus.CREATED);
    }

}
