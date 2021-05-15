package coffeeshop.business.concretes;

import coffeeshop.business.abstracts.BaseCustomerManager;
import coffeeshop.entities.concretes.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
		
		MernisCheckAdapter isValid; 
		
		public StarbucksCustomerManager(MernisCheckAdapter isValid) {
			super();
			this.isValid = isValid;
		}

		@Override
		public void add(Customer customer) {
			if(this.isValid.validate(customer)) {
				System.out.println("Saved to DB : " + customer.getFirstName() + " " + customer.getSurName());
			} else {
				System.out.println("Bilgileriniz doðrulanamadý.");
			}
			
		}

}
