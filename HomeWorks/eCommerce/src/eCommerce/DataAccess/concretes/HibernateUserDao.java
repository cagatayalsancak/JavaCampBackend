package eCommerce.DataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eCommerce.DataAccess.abstracts.UserDao;
import eCommerce.entities.concretes.User;

public class HibernateUserDao implements UserDao{

	ArrayList<User> users = new ArrayList<User>();
	
	public HibernateUserDao() {
		
	}
	
	public HibernateUserDao(ArrayList<User> users) {
		this.users = users;
	}

	@Override
	public List<User> getAll() {
		return this.users;
	}

	@Override
	public void add(User user) {
		System.out.println("Hibernate ile eklendi : " + user.getFirstName() + " " + user.getSurName());
		
	}

	@Override
	public void update(User user) {
		System.out.println("Hibernate ile güncellendi : " + user.getFirstName() + " " + user.getSurName());
		
	}

	@Override
	public void delete(User user) {
		System.out.println("Hibernate ile silindi : " + user.getFirstName() + " " + user.getSurName());
		
	}

	@Override
	public User get(int id) {
		User result = null;
		
		for (User user : users) {
			if(user.getId() == id) {
				result = user;
			}
		}
		return result;
	}

}