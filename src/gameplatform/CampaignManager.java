package gameplatform;

public class CampaignManager implements Icampaigns {

    Campaign campaign = new Campaign();
    
    @Override
    public void specialCampaign1(Player player) {
        System.out.println("We Have Special Offers For You "+ player.getFirstName());
        campaign.standardCampaign();
        campaign.specialCampaign2();
        campaign.specialCampaign3();
        System.out.println("");
    }

    @Override
    public void specialcampaign2(Player player) {
        System.out.println("We Have Special Offers For You "+ player.getFirstName());
        campaign.standardCampaign();
        campaign.specialCampaign2();
        campaign.specialCampaign3();
        campaign.specialCampaign4();
        System.out.println("");
    }

    @Override
    public void campaignAdd() {
        System.out.println("*****************************************************");
        System.out.println("New Campaign Has Been Added To The System");
        System.out.println("The Boss Has Gone Mad");
        System.out.println("10% Discount For Those Who Pre-Register For The Games");
    }

    @Override
    public void campaignDelete() {
        System.out.println("******************************************************");
        System.out.println("Campaign Has Been Deleted From The System");
        System.out.println("Campaign 4 is Now Over");
        System.out.println("Deleted From The System");
    }

    @Override
    public void campaignUpdate() {
        System.out.println("*****************************************************");
        System.out.println("Update To The Campaign Has Arrived");
        System.out.println("The Boss Has Gone Mad");
        System.out.println("Get 15% off by pre-registering the game and purchasing an extra game");
    }

}
