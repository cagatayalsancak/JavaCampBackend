package eCommerce.business.abstracts;

import java.util.List;

import eCommerce.entities.concretes.User;

public interface UserCheckService {
	
	boolean checkFirstName(User user);
	boolean checkSurName(User user);
	boolean checkEmailAddressRegex(User user);
	boolean checkPassword(User user);
	boolean checkAuth(User user, String authCode);
	boolean isCheckEmail(User user, List<User> emailList);

}
