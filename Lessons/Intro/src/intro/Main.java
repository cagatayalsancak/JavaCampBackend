package intro;

public class Main {

	public static void main(String[] args) {
		
		//camelCase
		//Don't repeat yourself. Kendini tekrar etme
		String internetSubeButonu = "�nternet �ubeye gir";
		double dolarDun = 8.20;
		double dolarBugun = 8.20;
		int vade = 36;
		boolean dustuMu = false;
		
		System.out.println(internetSubeButonu);
		System.out.println(dolarDun);
		System.out.println(vade);
		System.out.println(dustuMu);
		
		if(dolarBugun<dolarDun) {
			System.out.println("Dolar d��t�");
		} else if(dolarBugun>dolarDun) {
			System.out.println("Dolar y�kseldi");	
		} else {
			System.out.println("Dolar e�itlendi.");
		}	

		String[] krediler = {
								"H�zl� Kredi",
								"Mutlu Emekli Kredi",
								"Konut Kredisi",
								"�ift�i Kredisi",
								"MSB Kredisi",
								"MEB Kredisi",
								"K�lt�r Bakanl��� Kredisi"
		};
		
		//foreach Y�ntemi 1
		for (String kredi: krediler) {
			System.out.println(kredi);
		}
		
		for(int i = 0; i<krediler.length; i++) {
			System.out.println(krediler[i]);
		}
		
		
		// Stack - Atamalardan sonra de�i�kenlerin de�erleri ba��ms�zd�r. De�i�kenlerin de�erleri de�i�mesi kendilerini etkiler.
		int sayi1 = 10;
		int sayi2 = 20;
		sayi1 = sayi2; // sayi1 = 20 // sayi2 = 20
		sayi2 = 100;
		System.out.println(sayi1); // sayi1 = 20 // sayi2 = 100
		
		// Heap - Atamalardan sonra listenin de�erleri en son atand�klar� listenin de�erine ba�l�d�r (liste yap�lar�nda).
		// ilk atand��� de�eri ge�ersiz k�lar.
		
		int[] sayilar1 = {1,2,3,4,5};  
		int[] sayilar2 = {10,20,30,40,50};  
		System.out.println(sayilar1[0]);   // sayilar1[0] = 1; // sayilar2[0] = 10;
		sayilar1 = sayilar2;
		System.out.println(sayilar1[0]); // sayilar1[0] = 10; // sayilar2[0] = 10;
		sayilar2[0] = 100;
		System.out.println(sayilar1[0]); // // sayilar1[0] = 100; // sayilar2[0] = 100;
		
		// Stack (String de�i�kenler i�in �stisna)
		String sehir1 = "Ankara";
		String sehir2 = "�stanbul";
		sehir1 = sehir2;
		sehir2 = "�zmir";
		System.out.println(sehir1);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
