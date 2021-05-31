package coffeeshop.business.concretes;


import coffeeshop.business.abstracts.CustomerCheckService;
import coffeeshop.entities.concretes.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;
import java.rmi.RemoteException;
import java.time.ZoneId;


public class MernisCheckAdapter implements CustomerCheckService {
	


	@Override
	public boolean validate(Customer customer) {
		
		KPSPublicSoap soapClient = new KPSPublicSoapProxy();
		boolean result = false;
		
		try {
				result = soapClient.TCKimlikNoDogrula(Long.parseLong(customer.getNationalIdentity()), 
						customer.getFirstName().toUpperCase(), 
						customer.getSurName().toUpperCase(), 
						customer.getDateOfBirth().toInstant().atZone(ZoneId.systemDefault()).toLocalDate().getYear());
				System.out.println("Bilgileri doðrulama : " + (result ? "Baþarýlý" : "Baþarýsýz"));
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return result;
		
		
	}
	
}
	
