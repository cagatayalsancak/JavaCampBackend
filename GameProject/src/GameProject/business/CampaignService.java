package GameProject.business;

import GameProject.entities.Campaign;
import GameProject.entities.Product;

public interface CampaignService {
	
	void add(Product product, Campaign campaign);
	void update(Product product, Campaign campaign);
	void delete(Product product, Campaign campaign);

}
