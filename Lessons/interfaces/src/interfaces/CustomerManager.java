package interfaces;

public class CustomerManager {
	
	private Logger[] loggers;
	
	public CustomerManager(Logger[] loggers) {
		this.loggers = loggers;
	}
	public void add(Customer customer) {
		System.out.println("M�steri eklendi " + customer.getFirstName());
		Utils.runLoggers(loggers, customer.getFirstName());
		
	}
	public void del(Customer customer) {
		System.out.println("M�steri silindi  " + customer.getFirstName());
		Utils.runLoggers(loggers, customer.getFirstName());
	}
}
