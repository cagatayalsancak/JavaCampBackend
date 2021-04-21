package intro;

public class main {

	public static void main(String[] args) {
		
		//camelCase
		//Don't repeat yourself. Kendini tekrar etme
		String internetSubeButonu = "Ýnternet Þubeye gir";
		double dolarDun = 8.20;
		double dolarBugun = 8.20;
		int vade = 36;
		boolean dustuMu = false;
		
		System.out.println(internetSubeButonu);
		System.out.println(dolarDun);
		System.out.println(vade);
		System.out.println(dustuMu);
		
		if(dolarBugun<dolarDun) {
			System.out.println("Dolar düþtü");
		} else if(dolarBugun>dolarDun) {
			System.out.println("Dolar yükseldi");	
		} else {
			System.out.println("Dolar eþitlendi.");
		}	

		String[] krediler = {
								"Hýzlý Kredi",
								"Mutlu Emekli Kredi",
								"Konut Kredisi",
								"Çiftçi Kredisi",
								"MSB Kredisi",
								"MEB Kredisi",
								"Kültür Bakanlýðý Kredisi"
		};
		
		//foreach Yöntemi 1
		for (String kredi: krediler) {
			System.out.println(kredi);
		}
		
		for(int i = 0; i<krediler.length; i++) {
			System.out.println(krediler[i]);
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
