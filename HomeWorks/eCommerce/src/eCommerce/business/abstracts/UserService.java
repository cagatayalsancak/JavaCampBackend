package eCommerce.business.abstracts;

import java.util.List;

import eCommerce.entities.concretes.User;

public interface UserService {
	
	void add(User user);
	void update(User user);
	void delete(User user);
	void register(User user);
	void login(User user, String email, String password);
	User get(int id);
	List<User> getAll();
	
}
