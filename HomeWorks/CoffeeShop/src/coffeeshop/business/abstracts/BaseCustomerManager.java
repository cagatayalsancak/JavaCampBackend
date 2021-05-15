package coffeeshop.business.abstracts;

import coffeeshop.entities.concretes.Customer;

public abstract class BaseCustomerManager implements CustomerService {

	@Override
	public void add(Customer customer) {
		System.out.println("added to DB : " + customer.getFirstName() + " " + customer.getSurName());
		
	}
	
}
