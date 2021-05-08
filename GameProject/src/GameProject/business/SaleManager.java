package GameProject.business;

import GameProject.entities.Player;
import GameProject.entities.Product;

public class SaleManager implements SaleService {

	@Override
	public void sell(Product product, Player player) {
		System.out.println(product.getName() + " ürünü " + player.getFirstName() + " " + player.getSurName()
							+ " adlý oyuncuya " + product.getUnitPrice() + " TL\'ye satýþý gerçekleþmiþtir. ");
		
	}
	@Override
	public void refund(Product product, Player player) {
		System.out.println(product.getName() + " ürünün iadesi için "
				+ player.getFirstName() + " " + player.getSurName() + " adlý oyuncuya "
				+ product.getUnitPrice() + " TL geri ödeme iþlemi gerçekleþtirilmiþtir.");
		
	}

	@Override
	public void cancelSale(Product product, Player player) {
		
		System.out.println(player.getFirstName() + " " + player.getSurName() + " adlý oyuncu tarafýndan alýnan " + product.getName() + " ürünün satýþ iptali gerçekleþtirilmiþtir. ");
		
	}

}
