package eCommerce.core.concretes;

import eCommerce.core.abstracts.LoggerService;
import eCommerce.entities.concretes.User;

public class TokenLogger implements LoggerService {

	User user = new User();
	
	
	
	@Override
	public void log(String message) {
		System.out.println("Lütfen hesabýnýzý doðrulayýn. \n "+ message + " : " + user.getAuthToken());
		
	}

}
