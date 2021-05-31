package eCommerce;

import eCommerce.business.concretes.GoogleAuth;
import eCommerce.business.concretes.UserManager;
import eCommerce.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
			
		UserManager userManager = new UserManager();
		User user1 = new User();
		user1.setId(1);
		user1.setFirstName("Çaðatay");
		user1.setSurName("Alsancak");
		user1.setEmailAdress("cagatay.alsancak071@gmail.com");
		user1.setPassword("123456mCa");
		
		User user2 = new User(2, "Mehmet", "Alsancak", "cagatay.alsancak@gmail.com", "987456mA", false);
		userManager.register(user2);
		User user3 = new User(2, "Mehmet", "Alsancak", "cagatay.alsancak07@gmail.com", "987456mA", false);
		userManager.register(user3);
		User user4 = new User(2, "Ab", "C", "asda@cati", "987456mA", false);
		userManager.register(user4);		
		
		userManager.login(user1, "cagatay.alsancak71@gmail.com", "123456mCa");
		userManager.login(user4, "sdfsdfsasd", "lkjdfgkljdfkjfg");
		
		GoogleAuth google = new GoogleAuth();
		google.register(user4);
	
	}

}
