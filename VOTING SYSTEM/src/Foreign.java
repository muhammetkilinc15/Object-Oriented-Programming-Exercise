public class Foreign extends Person {
    private String passportNumber;
    public Foreign(String name, int age) {
        super(name, age);
    }

    @Override
    public boolean Vote(int partyID, Party[] parties) {
        return super.Vote(partyID, parties) && isPassportValid();
    }
    private void getPassport() {
        System.out.print("Enter your Passport Number: ");
        this.passportNumber = scanner.nextLine();
    }

    private boolean isPassportValid() {
        getPassport();
        if (this.passportNumber.length() != 7) {
            return false;
        } else {
            for (int i = 1; i < passportNumber.length(); i++) {
                if (!Character.isLetter(passportNumber.charAt(0)) || !Character.isDigit(passportNumber.charAt(i))) {
                    return false;
                }
            }
        }
        return true;
    }
    @Override
    public String toString() {
        return super.toString() + " Foreign";
    }
}
