package gameplatform;

public class Player {

    private String firstName, lastName, NatonalityId;
    private int DateOfBirth;
    

    public Player(String firstName, String lastName, String NatonalityId, int DateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.NatonalityId = NatonalityId;
        this.DateOfBirth = DateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNatonalityId() {
        return NatonalityId;
    }

    public void setNatonalityId(String NatonalityId) {
        this.NatonalityId = NatonalityId;
    }

    public int getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(int DateOfBirth) {
        this.DateOfBirth = DateOfBirth;
    }
}
