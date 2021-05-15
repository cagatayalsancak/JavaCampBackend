package GameProject.business;

import GameProject.entities.Campaign;
import GameProject.entities.Product;

public interface ProductService {
	void add(Product product);
	void update(Product product);
	void delete(Product product);
	void addCampaign(Product product, Campaign campaign);

}
