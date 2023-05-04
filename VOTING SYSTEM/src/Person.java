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

    protected boolean Vote(int partyID, Party[] parties) {
        getCitizenIDNumber();
        if (checkIDValid(getID()) && this.getAge() >= 18 && !isVotingState()) {
            for (Party party : parties) {
                if (party.getID() == partyID) {
                    party.increaseTotalNumOfVotes();
                    changeVotingState();
                    return true;
                }
            }
        }
        return false;
    }

    protected void getCitizenIDNumber() {
        System.out.print("Enter your ID: ");
        this.ID = scanner.nextLine();
    }

    protected  boolean checkIDValid(String ID) {
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

    protected int getAge() {
        return age;
    }

    protected boolean isVotingState() {
        return votingState;
    }

    protected void changeVotingState() {
        this.votingState = true;
    }
    protected String getID() {
        return ID;
    }
}
