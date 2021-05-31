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
			System.out.println("Ýsim en az 3 karakter olmalýdýr.");
			return false;
		}
	}

	@Override
	public boolean checkSurName(User user) {
		if(user.getSurName().length() >= 2) {
			return true;
		} else {
			System.out.println("Soyisim en az 2 karakter olmalýdýr.");
			return false;
		}
	}

	@Override
	public boolean checkEmailAddressRegex(User user) {
		Pattern pattern = Pattern.compile(emailPattern, Pattern.CASE_INSENSITIVE);
		if(pattern.matcher(user.getEmailAdress()).find()) { 
			return pattern.matcher(user.getEmailAdress()).find();
		} else {
			System.out.println("Lütfen geçerli email adresi giriniz.");
			
		}
		return false;
	}

	@Override
	public boolean checkPassword(User user) {
		if(user.getPassword().length() >= 6) {
			return true;
		} else {
			System.out.println("Þifre en az 6 karakterden oluþmalýdýr.");
			
		}
		return false;
	}

	@Override
	public boolean checkAuth(User user, String authCode) {
		if(user.getAuthToken() == authCode) {
			return true;
		} else {
			System.out.println("Doðrulama kodunu yanlýþ girdiniz. Lütfen gönderilen kodu doðru þekilde giriniz.");
			
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
