package com.NBA;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;


@OpenAPIDefinition(info=@Info(
		title="My NBA Database",
		description="This is my first API",
		version="1.7"
		))



@RestController   //annotations going to
public class PlayerController {
	
	@Autowired           //allowing me to use the CRUD operations 
	PlayerRepository playerRepository;
	
	@PostMapping ("/players")  //anchor will allow me to add to the database
	public Player createPlayer(@RequestBody Player player) {
		Player savedPlayer = playerRepository.save(player);
		return savedPlayer;
		
	}
	
	@GetMapping("/players")
	public List<Player> allPlayers(){
		return playerRepository.findAll();
	}
	
	@PutMapping("/player/{id}")
	public Player updatePlayer(@PathVariable int id, @RequestBody Player player) {
		player.setPlayerId(id);
		return playerRepository.save(player);
	}
	
	@DeleteMapping("/players/{id}")
	public ResponseEntity<?> deletePlayer(@PathVariable int id) {
	    playerRepository.deleteById(id); // Use deleteById to remove the player
	    return ResponseEntity.ok().build();
	}
}
