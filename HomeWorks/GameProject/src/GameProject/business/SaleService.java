package GameProject.business;

import GameProject.entities.Player;
import GameProject.entities.Product;

public interface SaleService {
	void sell(Product product, Player player);
	void refund(Product product, Player player);
	void cancelSale(Product product, Player player);
}
