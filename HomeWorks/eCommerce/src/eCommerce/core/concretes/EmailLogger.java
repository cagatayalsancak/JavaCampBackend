package eCommerce.core.concretes;

import eCommerce.core.abstracts.LoggerService;

public class EmailLogger implements LoggerService{

	@Override
	public void log(String message) {
		System.out.println("Email ile loglandý. " + message);
		
	}

}
