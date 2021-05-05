package gameplatform;

public class computing implements Icomputing {

    @Override
    public void registration(Player player) {
        System.out.println("");
        System.out.println("Saved to the Database : " + player.getFirstName());
    }

    @Override
    public void informationUpdate(Player player, Player player1, Player playerUpdate) {
        System.out.println("********************************************");
        System.out.println("System Update is Performing\n"
                + "Entering New Information");
        System.out.println("");
        System.out.println("Old Knowledge");
        System.out.println("Old FirstName : " + player.getFirstName());
        System.out.println("Old LastName :" + player.getLastName());
        System.out.println("Old NationalityId :" + player.getNatonalityId());
        System.out.println("Old DateOfBirth :" + player.getDateOfBirth());
        System.out.println("");
        System.out.println("New informations");
        System.out.println("New FirstName : " + playerUpdate.getFirstName());
        System.out.println("New LastName : " + playerUpdate.getLastName());
        System.out.println("New NatonalityId : " + playerUpdate.getNatonalityId());
        System.out.println("New DateOfBirth : " + playerUpdate.getDateOfBirth());
        player = playerUpdate;
        System.out.println("");

    }

    @Override
    public void deregistration(Player playerUpdate, Player player1) {
        System.out.println("********************************************");
        System.out.println("Deleting the Desired User");
        System.out.println("");
        System.out.println("Player to be Deleted FirstName : " + playerUpdate.getFirstName());
        System.out.println("Player to be Deleted LastName : " + playerUpdate.getLastName());
        System.out.println("Player to be Deleted NatonalityId : " + playerUpdate.getNatonalityId());
        System.out.println("Player to be Deleted DateOfBirth : " + playerUpdate.getDateOfBirth());
        System.out.println("********************************************");
        

    }

}
