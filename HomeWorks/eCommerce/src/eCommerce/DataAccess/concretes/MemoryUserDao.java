package eCommerce.DataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eCommerce.DataAccess.abstracts.UserDao;
import eCommerce.entities.concretes.User;

public class MemoryUserDao implements UserDao {

	ArrayList<User> users = new ArrayList<User>();

	@Override
	public List<User> getAll() {
		return this.users;
	}

	@Override
	public void add(User user) {
		System.out.println("Memory'e eklendi : " + user.getFirstName() + " " + user.getSurName());
		
	}

	@Override
	public void update(User user) {
		System.out.println("Memory'de güncellendi : " + user.getFirstName() + " " + user.getSurName());
		
	}

	@Override
	public void delete(User user) {
		System.out.println("Memory'den silindi : " + user.getFirstName() + " " + user.getSurName());
		
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