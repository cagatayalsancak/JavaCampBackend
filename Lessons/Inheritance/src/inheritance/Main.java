package inheritance;

public class Main {

	public static void main(String[] args) {
		IndividualCustomer cati = new IndividualCustomer();  // Bireysel
		cati.customerNumber = "228471";
		
		CorporateCustomer mcabilisim = new CorporateCustomer(); // Kurumsal
		mcabilisim.customerNumber = "292284";
		
		UnionCustomer mca = new UnionCustomer();  // Sendika
		mca.customerNumber = "2547896";
		
		CustomerManager customerManager = new CustomerManager();
	//	customerManager.add(cati); // Bireysel Müþteri
	//	customerManager.add(mcabilisim);  // Kurumsal Müþteri
	//	customerManager.add(mca);  // Sendika Müþteri
		
		Customer[] customers = {cati, mcabilisim, mca};
		
		customerManager.addMultiple(customers);
		
	}

}
