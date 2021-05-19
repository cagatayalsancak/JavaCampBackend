package eCommerce.business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import eCommerce.DataAccess.abstracts.UserDao;
import eCommerce.DataAccess.concretes.HibernateUserDao;
import eCommerce.business.abstracts.UserService;
import eCommerce.core.concretes.EmailLogger;
import eCommerce.core.concretes.GenerateSecureToken;
import eCommerce.core.concretes.TokenLogger;
import eCommerce.entities.concretes.User;

public class UserManager implements UserService {
		
	
		List<User> users = new ArrayList<User>();
		UserDao userDao = new HibernateUserDao();
		UserCheckManager userCheckManager = new UserCheckManager();
		TokenLogger tokenLogger = new TokenLogger();
		EmailLogger logger = new EmailLogger();
		Scanner message = new Scanner(System.in);
		GenerateSecureToken token = new GenerateSecureToken();
		
		public UserManager() {
			
		}
		public UserManager(UserCheckManager userCheckManager) {
			this.userCheckManager = userCheckManager;
		}
	
		@Override
		public void add(User user) {
			userDao.add(user);
			logger.log("Kullanýcý eklendi : " + user.getEmailAdress());
			
		}
	
		@Override
		public void update(User user) {
			userDao.update(user);
			logger.log("Kullanýcý güncellendi : " + user.getEmailAdress());
			
		}
	
		@Override
		public void delete(User user) {
			userDao.delete(user);
			logger.log("Kullanýcý silindi : " + user.getEmailAdress());
		}
	
		@Override
		public User get(int id) {
			
			return null;
		}
	
		@Override
		public List<User> getAll() {
			return this.userDao.getAll();
		}
	
		@Override
		public void register(User user) {
			if(this.userCheckManager.checkFirstName(user) && 
				this.userCheckManager.checkSurName(user) && 
				this.userCheckManager.checkEmailAddressRegex(user) && 
				this.userCheckManager.checkPassword(user)) {
				
					if(this.userCheckManager.isCheckEmail(user, users)) {
						userDao.add(user);
						user.setAuthToken(token.createToken());
					} else {
						System.out.println("Girdiðiniz email adresi kullanýlmaktadýr. " + user.getId() + " " + user.getEmailAdress());
					}
				
				tokenLogger.log("Token");
				System.out.println("Lütfen doðrulama kodunu giriniz.");
								
				while(true) {
					String authCode = message.nextLine();
					if(userCheckManager.checkAuth(user, authCode)) {
						System.out.println("Hesabýnýz doðrulanmýþtýr. Giriþ yapabilirsiniz.");
						user.setAuth(true);
						logger.log("Kayýt");
						break;
					} else {
						System.out.println("Doðrulama kodunuzu kontrol ediniz.");
						continue;
					}
				}
			} else {
				System.out.println("Lütfen bilgilerinizi kontrol ediniz.");
				userDao.delete(user);
			}
		}
	
		@Override
		public void login(User user, String email, String password) {
			if(user.getEmailAdress() == email && user.getPassword() == password && user.isAuth()) {
				System.out.println("Giriþ iþlemi baþarýyla gerçekleþmiþtir.");
				logger.log(user.getEmailAdress() + " tarafýndan giriþ yapýldý.");
			} else {
				System.out.println("Giriþ baþarýsýz! Lütfen bilgilerinizi kontrol edin.");
			}
			
		}

}
