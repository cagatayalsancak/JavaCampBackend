package GameProject.business;

import GameProject.entities.Player;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;
import java.rmi.RemoteException;

public class PlayerCheckAdapter implements PlayerCheckService {
	
	
	@Override
	public boolean validate(Player player) {
		
		KPSPublicSoap soapClient = new KPSPublicSoapProxy();
		boolean result = false;
		
		try {
				result = soapClient.TCKimlikNoDogrula(Long.parseLong(player.getIdentityNumber()), 
						player.getFirstName(), 
						player.getSurName(), 
						player.getBirthYear());
				System.out.println("Bilgileri do�rulama : " + (result ? "Ba�ar�l�" : "Ba�ar�s�z"));
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return result;
		
		
	}
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
