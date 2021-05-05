package gameplatform;

public class PlayerCheckService {

    Player SavePlayer1 = new Player("Engin", "Demiroğ", "10020030099", 1985);
    Player SavePlayer2 = new Player("Yalçın", "Selçuk", "10120230399", 1999);
    Player array[] = {SavePlayer1, SavePlayer2};

    computing computing = new computing();

    public void checkService(Player player[]) {
        for (int i = 0; i < array.length; i++) {
            int k = 0;
            for (int j = 0; j < player.length; j++) {
                if (array[i].getFirstName().equals(player[j].getFirstName())
                        && array[i].getLastName().equals(player[j].getLastName())
                        && array[i].getNatonalityId().equals(player[j].getNatonalityId())
                        && array[i].getDateOfBirth() == player[j].getDateOfBirth()) {

                    computing.registration(array[i]);
                    k=1;
                }

            }
            if (k == 0) {
                System.out.println("The Information This Person Gives Did Not Match The System");

            }
        }
    }

}
