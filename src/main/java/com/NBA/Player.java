package com.NBA;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;  //data base persist item

@Entity
public class Player {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int playerId;  //primary key
	
	private String team;
	
	private String PlayerName;
	
	private String ImageUrl;
	
	

	public Player() {
		super();
	}

	public Player(int playerId) {
		super();
		this.playerId = playerId;
	}

	@Override
	public String toString() {
		return "Player [playerId=" + playerId + ", team=" + team + ", PlayerName=" + PlayerName + ", ImageUrl="
				+ ImageUrl + "]";
	}

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public String getPlayerName() {
		return PlayerName;
	}

	public void setPlayerName(String playerName) {
		PlayerName = playerName;
	}

	public String getImageUrl() {
		return ImageUrl;
	}

	public void setImageUrl(String imageUrl) {
		ImageUrl = imageUrl;
	}
	
	
	
	
	

}
