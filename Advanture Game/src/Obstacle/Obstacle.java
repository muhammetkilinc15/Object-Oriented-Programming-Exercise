package Obstacle;

public abstract class Obstacle {

    private String name;
    private int id;
    private int damage;
    private int healthy;
    private int award;
    private int orjinalHealth;

    public Obstacle(String name, int id, int damage, int healthy, int award) {
        this.name = name;
        this.id = id;
        this.damage = damage;
        this.healthy = healthy;
        this.award=award;
        this.orjinalHealth = healthy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealthy() {
        return healthy;
    }

    public void setHealthy(int healthy) {
        if (healthy<=0){
            healthy=0;
        }
        this.healthy = healthy;
    }

    public int getAward() {
        return award;
    }

    public void setAward(int award) {
        this.award = award;
    }

    public int getOrjinalHealth() {
        return orjinalHealth;
    }

    public void setOrjinalHealth(int orjinalHealth) {
        this.orjinalHealth = orjinalHealth;
    }
}
