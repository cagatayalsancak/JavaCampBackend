package GameProject.business;

import GameProject.entities.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		
		System.out.println(campaign.getName() + " adlý kampanya %" + campaign.getDiscountRatio() + " indirim ile baþlamýþtýr.");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getName() + " kampanyasýnda güncelleme yapýlmýþtýr.");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getName() + "kampanya sona ermiþtir. ");
		
	}

}
