package GameProject.business;

import GameProject.entities.Player;
import GameProject.entities.Product;

public class SaleManager implements SaleService {

	@Override
	public void sell(Product product, Player player) {
		System.out.println(product.getName() + " �r�n� " + player.getFirstName() + " " + player.getSurName()
							+ " adl� oyuncuya " + product.getUnitPrice() + " TL\'ye sat��� ger�ekle�mi�tir. ");
		
	}
	@Override
	public void refund(Product product, Player player) {
		System.out.println(product.getName() + " �r�n�n iadesi i�in "
				+ player.getFirstName() + " " + player.getSurName() + " adl� oyuncuya "
				+ product.getUnitPrice() + " TL geri �deme i�lemi ger�ekle�tirilmi�tir.");
		
	}

	@Override
	public void cancelSale(Product product, Player player) {
		
		System.out.println(player.getFirstName() + " " + player.getSurName() + " adl� oyuncu taraf�ndan al�nan " + product.getName() + " �r�n�n sat�� iptali ger�ekle�tirilmi�tir. ");
		
	}

}
