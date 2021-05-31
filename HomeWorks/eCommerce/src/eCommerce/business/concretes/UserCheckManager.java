package eCommerce.business.concretes;

import java.util.List;
import java.util.regex.Pattern;
import eCommerce.business.abstracts.UserCheckService;
import eCommerce.entities.concretes.User;

public class UserCheckManager implements UserCheckService {

	
	private static final String emailPattern = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|io|biz|info|xyz)(.[A-Z]{2})?$";
	public int upperBoundCode = 6;
	
	public UserCheckManager() {
		
	}
	
	
	@Override
	public boolean checkFirstName(User user) {
		if(user.getFirstName().length() >= 3) {
			return true;
		} else {
			System.out.println("�sim en az 3 karakter olmal�d�r.");
			return false;
		}
	}

	@Override
	public boolean checkSurName(User user) {
		if(user.getSurName().length() >= 2) {
			return true;
		} else {
			System.out.println("Soyisim en az 2 karakter olmal�d�r.");
			return false;
		}
	}

	@Override
	public boolean checkEmailAddressRegex(User user) {
		Pattern pattern = Pattern.compile(emailPattern, Pattern.CASE_INSENSITIVE);
		if(pattern.matcher(user.getEmailAdress()).find()) { 
			return pattern.matcher(user.getEmailAdress()).find();
		} else {
			System.out.println("L�tfen ge�erli email adresi giriniz.");
			
		}
		return false;
	}

	@Override
	public boolean checkPassword(User user) {
		if(user.getPassword().length() >= 6) {
			return true;
		} else {
			System.out.println("�ifre en az 6 karakterden olu�mal�d�r.");
			
		}
		return false;
	}

	@Override
	public boolean checkAuth(User user, String authCode) {
		if(user.getAuthToken() == authCode) {
			return true;
		} else {
			System.out.println("Do�rulama kodunu yanl�� girdiniz. L�tfen g�nderilen kodu do�ru �ekilde giriniz.");
			
		} return false; 
	}


	@Override
	public boolean isCheckEmail(User user, List<User> emailList) {
		for(User email : emailList) {
			if(user.getEmailAdress() != email.getEmailAdress()) {
				return true;
			}
		}
		return false;
	} 
	
}
