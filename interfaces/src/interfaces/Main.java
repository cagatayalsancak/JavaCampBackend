package interfaces;

public class Main {

	public static void main(String[] args) {
		
		Logger[] loggers = {new FileLogger(), new SmsLogger(), new EmailLogger()};
		
		CustomerManager customerManager = new CustomerManager(loggers);
		Customer engin = new Customer(1, "Engin", "DEMÝROÐ");
		
		customerManager.add(engin);
	}

}
