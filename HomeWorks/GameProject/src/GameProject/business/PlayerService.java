package GameProject.business;

import java.util.List;

import GameProject.entities.Player;

public interface PlayerService {
	void add(Player player);
	void update(Player player);
	void delete(Player player);
	boolean isIdentityNumberValid(String identityNumber);
	boolean isFirstName(String firstName);
	boolean isSurName(String surName);
	boolean isEmailAddress(String emailAddress);
	List<Player> getAll();
	

}
