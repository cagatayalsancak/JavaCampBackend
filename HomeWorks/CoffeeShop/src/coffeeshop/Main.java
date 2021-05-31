package coffeeshop;

import java.util.GregorianCalendar;

import coffeeshop.business.abstracts.BaseCustomerManager;
import coffeeshop.business.concretes.MernisCheckAdapter;
import coffeeshop.business.concretes.NeroCustomerManager;
import coffeeshop.business.concretes.StarbucksCustomerManager;
import coffeeshop.entities.concretes.Customer;

public class Main {

	public static void main(String[] args) {
		
		Customer customer1 = new Customer();
		customer1.setId(1);
		customer1.setFirstName("Mehmet Çaðatay");
		customer1.setSurName("Alsancak");
		customer1.setDateOfBirth(new GregorianCalendar(1993,11,02).getTime()); // 12. ayý 11. index olarak tanýyor.
		customer1.setNationalIdentity("123456");
		
		BaseCustomerManager starbucksCustomerManager = new StarbucksCustomerManager(new MernisCheckAdapter());
		starbucksCustomerManager.add(customer1);
		
		BaseCustomerManager neroCustomerManager = new NeroCustomerManager();
		neroCustomerManager.add(customer1);
		
		System.out.println(customer1.getDateOfBirth());
		
		
		
	}

}
