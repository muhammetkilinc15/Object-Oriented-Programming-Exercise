import java.util.Scanner;

public class Person {
    private String name;
    private int age;
    private boolean votingState;
    private String ID;
    protected static Scanner scanner = new Scanner(System.in);

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.votingState = false;
    }

    public boolean Vote(int partyID, Party[] parties) {
        getCitizenIDNumber();
        if (checkIDValid(getID()) && this.getAge() >= 18 && !isVotingState()) {
            for (Party party : parties) {
                if (party.getID() == partyID) {
                    party.increaseTotalNumOfVotes();
                    changeVotingState(true);
                    return true;
                }
            }
        }
        return false;
    }

    // This method gets the ID number from the citizen
    private void getCitizenIDNumber() {
        System.out.print("Enter your ID: ");
        this.ID = scanner.nextLine();
    }

    // This method ID number checks if it is valid
    private static boolean checkIDValid(String ID) {
        if (ID.length() == 11) {
            for (int i = 0; i < ID.length(); i++) {
                if (Character.isLetter(ID.charAt(i))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + ", Age: " + this.age + ", Voting state: " + this.votingState + "\nCitizenship status: ";
    }

    private int getAge() {
        return this.age;
    }
    private boolean isVotingState() {
        return this.votingState;
    }

    protected void changeVotingState(boolean votingState) {
        this.votingState = votingState;
    }
    protected String getID() {
        return this.ID;
    }
}
