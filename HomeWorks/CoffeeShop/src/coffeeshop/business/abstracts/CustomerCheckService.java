package coffeeshop.business.abstracts;

import coffeeshop.entities.concretes.Customer;

public interface CustomerCheckService {
	
	boolean validate(Customer customer);
}
