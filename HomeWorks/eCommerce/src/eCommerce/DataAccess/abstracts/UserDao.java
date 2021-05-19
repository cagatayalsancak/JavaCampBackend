package eCommerce.DataAccess.abstracts;

import java.util.List;

import eCommerce.entities.concretes.User;


public interface UserDao {
	void add(User user);
	void update(User user);
	void delete(User user);
	User get(int id);
	List<User> getAll();
}
