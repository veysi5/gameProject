package concrete;

import abstracts.*;
import entities.*;

public class CamaignManager implements CampaignService {

	@Override
	public void save(Campaign campaign) {
		System.out.println("Kampanya eklendi : " + campaign.getName() + " %" + campaign.getDiscount());
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Kampanya güncellendi : " + campaign.getName() + " %" + campaign.getDiscount());		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Kampanya silindi : " + campaign.getName());		
	}
	
}
