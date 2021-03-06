package GameProject.business;

import GameProject.entities.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		
		System.out.println(campaign.getName() + " adlı kampanya %" + campaign.getDiscountRatio() + " indirim ile başlamıştır.");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getName() + " kampanyasında güncelleme yapılmıştır.");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getName() + "kampanya sona ermiştir. ");
		
	}

}
