package Location;

import Location.ToolStore.Armor;
import Location.ToolStore.Weapon;
import Obstacle.Obstacle;
import Player.Player;

import java.util.Random;

public class BattleLoc extends Location {
    private Obstacle obstacle;
    private String award;
    private int maxObstacle;

    public BattleLoc(Player player, String name, Obstacle obstacle, String award, int maxObstacle) {
        super(player, name);
        this.obstacle = obstacle;
        this.award = award;
        this.maxObstacle = maxObstacle;
    }
    @Override
    public boolean onLocation() {
        int obstacleNumber = this.getRandomObstacleNumber();
        System.out.println("⏺ You are here now: " + this.getName());
        System.out.println("Be carefully, " + +obstacleNumber + " " + this.obstacle.getName() + " lives here");
        System.out.println("<F>ight or <R>un");
        String selectOperation = scanner.nextLine();
        selectOperation = selectOperation.toUpperCase();
        if (selectOperation.equals("F") && combat(obstacleNumber)) {
            System.out.println("You have defeated all the enemies in the "+this.getName());
            if (this.getName().equals("Cave")) {
                getPlayer().getInventory().setFood(true);
            } else if (this.getName().equals("Forest")) {
                getPlayer().getInventory().setFirewood(true);
            } else if (this.getName().equals("River")) {
                getPlayer().getInventory().setWater(true);
            }
            return true;
        }
        if (this.getPlayer().getHealthy() <= 0) {
            System.out.println("You died");
            return false;
        }
        return true;
    }
    public void loot(){
        Random random= new Random();
        int randomNumber= random.nextInt(1,101);
        int randomLoot=random.nextInt(1,101);
        if (randomNumber<=15){
            if (randomLoot<=15){
                System.out.println("you won a rifle!!!");
                getPlayer().getInventory().setWeapon(Weapon.getWeaponObjById(1));
            } else if (randomLoot<=45) {
                System.out.println("You won the sword");
                getPlayer().getInventory().setWeapon(Weapon.getWeaponObjById(2));
            }else {
                System.out.println("You won a pistol");
                getPlayer().getInventory().setWeapon(Weapon.getWeaponObjById(3));
            }
        }else if (randomNumber<=30){
            if (randomLoot<=20){
                System.out.println("you have gained heavy armor");
                getPlayer().getInventory().setArmor(Armor.getWeaponObjById(3));
            } else if (randomLoot<=50) {
                System.out.println("you have earned medium armor");
                getPlayer().getInventory().setArmor(Armor.getWeaponObjById(2));
            }else {
                System.out.println("you have gained light armor");
                getPlayer().getInventory().setArmor(Armor.getWeaponObjById(1));
            }
        }else if (randomNumber<=55){
            if (randomLoot<=20){
                System.out.println("You won 10 lira");
                getPlayer().setMoney(this.getPlayer().getMoney()+10);
            } else if (randomLoot<=50) {
                System.out.println("You won 5 lira");
                getPlayer().setMoney(this.getPlayer().getMoney()+5);
            }else {
                System.out.println("You won 1 lira");
                getPlayer().setMoney(this.getPlayer().getMoney()+1);
            }
        }else {
            System.out.println("You did not win any loots");
        }
    }
    public void afterHit() {
        System.out.println("Your health: " + this.getPlayer().getHealthy());
        System.out.println(this.obstacle.getName() + " health: " + this.obstacle.getHealthy());
    }
    public boolean combat(int obstacleNumber) {
        boolean firstHit = firstHit();
        for (int i = 0; i < obstacleNumber; i++) {
            this.obstacle.setHealthy(this.getObstacle().getOrjinalHealth());
            if (obstacle.getName().equals("Snake")){
                Random random = new Random();
                obstacle.setDamage(random.nextInt(3,7));
            }
            playerStatus();
            obstacleStatus(i);
            if (firstHit) {
                while (getPlayer().getHealthy() > 0 && getObstacle().getHealthy() > 0) {
                    System.out.println("<H>it or <r>un: ");
                    String selectCase = scanner.nextLine().toUpperCase();
                    if (selectCase.equals("H")) {
                        System.out.println("you shot");
                        obstacle.setHealthy(this.obstacle.getHealthy() - this.getPlayer().getTotalDamage());
                        afterHit();
                        if (this.getObstacle().getHealthy() > 0) {
                            System.out.println();
                            System.out.println("Obstacle hit you !!!");
                            int obstacleDamage = this.getObstacle().getDamage() - this.getPlayer().getInventory().getArmor().getBlock();
                            if (obstacleDamage < 0) {
                                obstacleDamage = 0;
                            }
                            this.getPlayer().setHealthy(this.getPlayer().getHealthy() - obstacleDamage);
                            afterHit();
                        }
                    } else {
                        return false;
                    }
                }
            } else {
                while (getPlayer().getHealthy() > 0 && getObstacle().getHealthy() > 0) {
                    if (this.getObstacle().getHealthy() > 0) {
                        System.out.println();
                        System.out.println("Obstacle hit you !!!");
                        int obstacleDamage = this.getObstacle().getDamage() - this.getPlayer().getInventory().getArmor().getBlock();
                        if (obstacleDamage < 0) {
                            obstacleDamage = 0;
                        }
                        this.getPlayer().setHealthy(this.getPlayer().getHealthy() - obstacleDamage);
                        afterHit();
                    }
                    if (this.getPlayer().getHealthy()>0){
                        System.out.println("<H>it or <r>un: ");
                        String selectCase = scanner.nextLine().toUpperCase();
                        if (selectCase.equals("H")) {
                            System.out.println("you shot");
                            obstacle.setHealthy(this.obstacle.getHealthy() - this.getPlayer().getTotalDamage());
                            afterHit();
                        } else {
                            return false;
                        }
                    }
                }
            }
            if (this.getObstacle().getHealthy() < this.getPlayer().getHealthy()) {
                System.out.println("You killed the "+this.getObstacle().getName());
                if (!this.getObstacle().getName().equals("Snake")){
                    System.out.println( "You killed the "+this.getObstacle().getAward() );
                    this.getPlayer().setMoney(this.getPlayer().getMoney() + this.getObstacle().getAward());
                }else {
                    loot();
                }
                System.out.println("Current money: " + this.getPlayer().getMoney());
            } else {
                return false;
            }
        }
        return true;
    }

    public boolean firstHit() {
        Random random = new Random();
        return random.nextBoolean();
    }

    public void playerStatus() {
        System.out.println();
        System.out.println("Player values: ");
        System.out.println("----------------------------");
        System.out.println("Health: " + this.getPlayer().getHealthy());
        System.out.println("Weapon: " + this.getPlayer().getInventory().getWeapon().getName());
        System.out.println("Armor: " + this.getPlayer().getInventory().getArmor().getName());
        System.out.println("Damage: " + this.getPlayer().getTotalDamage());
        System.out.println("Blocking: " + this.getPlayer().getInventory().getArmor().getBlock());
        System.out.println("Money: " + this.getPlayer().getMoney());
        System.out.println();
    }

    public void obstacleStatus(int i) {
        System.out.println();
        System.out.println((i + 1) + "." + this.getObstacle().getName() + " values ");
        System.out.println("----------------------------");
        System.out.println("Health: " + this.getObstacle().getHealthy());
        System.out.println("Damage: " + this.getObstacle().getDamage());
        System.out.println("Award: " + this.getObstacle().getAward());
        System.out.println();
    }

    public int getRandomObstacleNumber() {
        Random random = new Random();
        return random.nextInt(1, this.maxObstacle + 1);
    }

    public Obstacle getObstacle() {
        return obstacle;
    }

    public void setObstacle(Obstacle obstacle) {
        this.obstacle = obstacle;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }
}
