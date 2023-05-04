public class Turkish extends Person {

    public Turkish(String name, int age) {
        super(name, age);
    }

    @Override
    protected boolean Vote(int partyID, Party[] parties) {

        return super.Vote(partyID, parties);
    }

    @Override
    public String toString() {
        return super.toString() + " Turkish";
    }
}
