public class Party {
    private String name;
    private int partyID;
    private int totalNumOfVotes;

    public Party(String name, int partyID) {
        this.name = name;
        this.partyID = partyID;
        totalNumOfVotes = 0;
    }

    // this function increases the party's vote
    public void increaseTotalNumOfVotes() {
        this.totalNumOfVotes++;
    }

    public int getTotalNumOfVotes() {
        return totalNumOfVotes;
    }

    public void setTotalNumOfVotes(int totalNumOfVotes) {
        if (totalNumOfVotes <= 0) {
            totalNumOfVotes = 0;
        }
        this.totalNumOfVotes = totalNumOfVotes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return this.partyID;
    }

    @Override
    public String toString() {
        return "Party ID: " + this.partyID + ", Party Name: " + this.name + ", Number of the votes: " + this.totalNumOfVotes;
    }
}
