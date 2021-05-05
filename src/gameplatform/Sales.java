package gameplatform;

public class Sales {
    CampaignManager campaignManager = new CampaignManager();
    
    public void sales(Player player) {
        if (player.getFirstName().equals("Yalçın") && player.getLastName().equals("Selçuk")
                && player.getNatonalityId().equals("10120230399") && player.getDateOfBirth() == 1999) {
            campaignManager.specialCampaign1(player);

        } else if (player.getFirstName().equals("Engin") && player.getLastName().equals("Demiroğ")
                && player.getNatonalityId().equals("10020030099") && player.getDateOfBirth() == 1985) {
            campaignManager.specialcampaign2(player);
        }
    }

}
