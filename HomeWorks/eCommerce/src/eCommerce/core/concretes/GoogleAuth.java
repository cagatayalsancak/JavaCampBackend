package eCommerce.core.concretes;

import java.util.List;

import eCommerce.DataAccess.abstracts.UserDao;
import eCommerce.DataAccess.concretes.HibernateUserDao;
import eCommerce.business.abstracts.UserService;
import eCommerce.core.abstracts.LoggerService;
import eCommerce.entities.concretes.User;

public class GoogleAuth implements UserService {
	
	UserDao userDao = new HibernateUserDao();
	LoggerService logger = new EmailLogger();
	
	@Override
	public void add(User user) {
		userDao.add(user);
		logger.log("Kullanýcý eklendi.");
	}

	@Override
	public void update(User user) {
		userDao.update(user);
		logger.log("Google ile Kullanýcý güncellendi.");
		
	}

	@Override
	public void delete(User user) {
		userDao.delete(user);
		logger.log("Kullanýcý silindi.");
		
	}

	@Override
	public void register(User user) {
		add(user);
		logger.log("Google ile Kayýt tamamlandý.");
		
	}

	@Override
	public void login(User user, String email, String password) {
		logger.log("Google ile giriþ yapýldý.");
		
		
	}

	@Override
	public User get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
