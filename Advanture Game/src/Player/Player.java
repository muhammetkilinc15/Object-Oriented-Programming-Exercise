package Player;

import Inventory.Inventory;
import Location.ToolStore.Weapon;

import java.util.Scanner;

public class Player {
    private int damage;
    private int healthy;
    private int money;
    private int orijinalHealth;
    private String name;
    private String characterName;
    private Scanner scanner = new Scanner(System.in);
    private Inventory inventory;

    public Player(String name) {
        this.name = name;
        this.inventory = new Inventory();
    }

    public void selectChar() {
        System.out.println("\nCharacters\n---------------------------------------------------");
        System.out.println("| Character |  ID  |  Damage | Health   |  Money  |");
        GameCharacter[] gameCharacters = {new Samurai(), new Archer(), new Knight()};
        for (GameCharacter a : gameCharacters) {
            System.out.println("---------------------------------------------------");
            System.out.printf("|  %-8s |  %-3s |    %-4s |   %-5s  |   %-5s |\n", a.getName(), a.getId(), a.getDamage(), a.getHealthy(), a.getMoney());
        }
        System.out.println("---------------------------------------------------");
        int selectChar = 0;
        while (true) {
            System.out.print("Please,Select a character: ");
            selectChar = scanner.nextInt();
            if (selectChar >= 1 && selectChar <= gameCharacters.length) {
                switch (selectChar) {
                    case 1:
                        updatePlayerFeatures(new Samurai());
                        break;
                    case 2:
                        updatePlayerFeatures(new Archer());
                        break;
                    case 3:
                        updatePlayerFeatures(new Knight());
                        break;
                }
                break;
            }
        }
        printPlayerFeatures();
    }

    // This method update the player features
    public void updatePlayerFeatures(GameCharacter gameCharacter) {
        this.setDamage(gameCharacter.getDamage()); // damage
        this.setCharacterName(gameCharacter.getName()); // character name
        this.setHealthy(gameCharacter.getHealthy()); // health
        this.setMoney(gameCharacter.getMoney()); // money
        this.setOrijinalHealth(gameCharacter.getHealthy());
    }

    public void printPlayerFeatures() {
        System.out.printf("👉 Character:%-8s  Damage: %-3s  Healthy: %-4s  Money: %-5s \n", this.getCharacterName(), this.getTotalDamage(), this.getHealthy(), this.getMoney());
    }

    public void printPlayerInfo() {
        System.out.printf("\nYour Weapon: %s ,Your armor: %s ,Your block: %s ,Your damage: %s ,Your healthy: %s ,Your money: %s \n", this.getInventory().getWeapon().getName(), this.getInventory().getArmor().getName(), this.getInventory().getArmor().getBlock(), this.getTotalDamage(), this.getHealthy(), this.getMoney());
    }

    public int getTotalDamage() {
        return damage + this.getInventory().getWeapon().getDamage();
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
        if (healthy < 0) {
            healthy = 0;
        }
        this.healthy = healthy;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String chracterName) {
        this.characterName = chracterName;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public int getOrijinalHealth() {
        return orijinalHealth;
    }

    public void setOrijinalHealth(int orijinalHealth) {
        this.orijinalHealth = orijinalHealth;
    }
}
