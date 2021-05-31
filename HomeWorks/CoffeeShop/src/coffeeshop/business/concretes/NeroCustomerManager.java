package coffeeshop.business.concretes;

import coffeeshop.business.abstracts.BaseCustomerManager;
import coffeeshop.entities.concretes.Customer;

public class NeroCustomerManager extends BaseCustomerManager {

	@Override
	public void add(Customer customer) {
		System.out.println("Saved to DB : " + customer.getFirstName() + " " + customer.getSurName());
		
	}

}
