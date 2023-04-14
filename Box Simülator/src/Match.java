import java.util.Random;

public class Match {
    private Fighter f1;
    private Fighter f2;
    int minimumWeight;
    int maxWeight;
    int rountNumber;

    public Match(Fighter f1, Fighter f2, int minimumWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minimumWeight = minimumWeight;
        this.maxWeight = maxWeight;
        this.rountNumber = 1;
    }

    public void run() {
        if (isCheck()) {
            while (this.f1.getHealthy() > 0 && this.f2.getHealthy() > 0) {
                System.out.println("******🔥🌟 " + rountNumber + ".Round 🔥🌟******");
                if (randomFirstFighter()) {
                    this.f2.setHealthy(this.f1.hit(this.f2));
                    if (isWin()) {
                        break;
                    }
                    this.f1.setHealthy(this.f2.hit(f1));
                    if (isWin()) {
                        break;
                    }
                    System.out.println(this.f1.getName() + " health: " + this.f1.getHealthy());
                    System.out.println(this.f2.getName() + " health: " + this.f2.getHealthy());
                    System.out.println("-------------------------------\n");
                } else {
                    this.f1.setHealthy(this.f2.hit(f1));
                    if (isWin()) {
                        break;
                    }
                    this.f2.setHealthy(this.f1.hit(this.f2));
                    if (isWin()) {
                        break;
                    }
                    System.out.println(this.f1.getName() + " health: " + this.f1.getHealthy());
                    System.out.println(this.f2.getName() + " health: " + this.f2.getHealthy());
                    System.out.println("-------------------------------\n");
                }
                rountNumber++;
            }
        } else {
            System.out.println("The weights of these athletes do not match!!!");
        }
    }

    // This method determine which fighter first hit
    public boolean randomFirstFighter() {
        Random random = new Random();
        return random.nextBoolean();
    }

    // This method check fighters weight
    public boolean isCheck() {
        return (this.f1.getWeight() >= minimumWeight && this.f2.getWeight() >= minimumWeight) && (this.f1.getWeight() <= maxWeight && this.f2.getWeight() <= maxWeight);
    }


    // This method check who is a fighter win the match.
    // İf method return false ,
    public boolean isWin() {
        if (this.f1.getHealthy() == 0) {
            System.out.println(this.f2.getName() + " win ");
            return true;
        } else if (this.f2.getHealthy() == 0) {
            System.out.println(this.f1.getName() + " win");
            return true;
        }
        return false;
    }
}
