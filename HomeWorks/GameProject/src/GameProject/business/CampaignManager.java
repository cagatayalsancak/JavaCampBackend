package GameProject.business;

import GameProject.entities.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		
		System.out.println(campaign.getName() + " adl� kampanya %" + campaign.getDiscountRatio() + " indirim ile ba�lam��t�r.");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getName() + " kampanyas�nda g�ncelleme yap�lm��t�r.");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getName() + "kampanya sona ermi�tir. ");
		
	}

}
