package gameplatform;

public class GamePlatform {

    public static void main(String[] args) {
        Player player = new Player("Yalçın", "Selçuk", "10120230399", 1999);
        Player player1 = new Player("Engin", "Demiroğ", "10020030099", 1985);            

        Player playerUpdate = new Player("Yalçın", "Selçuk", "10020030099", 1998);
       
        Player players[] = {player,player1};
        
        computing computing = new computing();

        PlayerCheckService playerCheckService = new PlayerCheckService();

        playerCheckService.checkService(players);

        System.out.println("");

        computing.informationUpdate(player,player1, playerUpdate);
        computing.deregistration(playerUpdate, player1);
        
        Sales sales = new Sales();
        sales.sales(player);
        sales.sales(player1);
        
        CampaignManager campaign = new CampaignManager();
        campaign.campaignAdd();
        campaign.campaignDelete();
        campaign.campaignUpdate();
        
        
    }

}
