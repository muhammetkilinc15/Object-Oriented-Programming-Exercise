import java.util.Random;

public class Fighter {
    private String name;
    private int damage;
    private int healthy;
    private int weight;
    private int dodge;

    public Fighter(String name, int damage, int healthy, int weight, int dodge) {
        this.name = name;
        this.damage = damage;
        this.healthy = healthy;
        this.weight = weight;
        if (dodge < 0 || dodge > 100) {
            this.dodge = 0;
        } else {
            this.dodge = dodge;
        }
    }

    public int hit(Fighter foe) {
        System.out.printf("%s ==> %d damage to %s!!!\n",this.name, this.damage,  foe.name);
        if (foe.isDodge()) {
            System.out.println(foe.getName() + " blocked incoming damage");
            return foe.getHealthy();
        }
        if (foe.getHealthy() - this.damage < 0) {
            return 0;
        }
        return foe.getHealthy() - this.getDamage();
    }
    public boolean isDodge() {
        Random random = new Random();
        double randomNumber = random.nextDouble(1,101);
        return this.dodge >= randomNumber;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }
    public int getHealthy() {
        return healthy;
    }
    public void setHealthy(int healthy) {
        this.healthy = healthy;
    }

    public int getWeight() {
        return weight;
    }
}
