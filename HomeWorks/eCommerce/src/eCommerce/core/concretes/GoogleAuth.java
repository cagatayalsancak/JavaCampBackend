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
		logger.log("Kullan�c� eklendi.");
	}

	@Override
	public void update(User user) {
		userDao.update(user);
		logger.log("Google ile Kullan�c� g�ncellendi.");
		
	}

	@Override
	public void delete(User user) {
		userDao.delete(user);
		logger.log("Kullan�c� silindi.");
		
	}

	@Override
	public void register(User user) {
		add(user);
		logger.log("Google ile Kay�t tamamland�.");
		
	}

	@Override
	public void login(User user, String email, String password) {
		logger.log("Google ile giri� yap�ld�.");
		
		
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
