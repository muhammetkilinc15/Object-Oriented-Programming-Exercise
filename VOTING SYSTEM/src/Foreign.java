public class Foreign extends Person {
    private String passportNumber;

    public Foreign(String name, int age) {
        super(name, age);
    }

    @Override
    public boolean Vote(int partyID, Party[] parties) {
        boolean result1 = super.Vote(partyID, parties);
        boolean result2 = isPassportValid(partyID, parties);
        return result1 && result2;
    }

    private void getPassport() {
        System.out.print("Enter your Passport Number: ");
        this.passportNumber = scanner.nextLine();
    }

    private boolean isPassportValid(int partyID, Party[] parties) {
        getPassport();
        boolean result = true;
        if (this.passportNumber.length() != 7) {
            result = false;
        } else {
            for (int i = 1; i < passportNumber.length(); i++) {
                if (!Character.isLetter(passportNumber.charAt(0)) || !Character.isDigit(passportNumber.charAt(i))) {
                    result = false;
                }
            }
        }
        if (!result) {
            parties[partyID].setTotalNumOfVotes(parties[partyID].getTotalNumOfVotes() - 1);
            setVotingState(false);
        }
        return result;
    }

    @Override
    public String toString() {
        return super.toString() + " Foreign";
    }
}
