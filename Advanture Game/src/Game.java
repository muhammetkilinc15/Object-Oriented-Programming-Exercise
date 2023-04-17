import Location.Location;
import Location.Mine;
import Player.Player;
import Location.ToolStore.ToolStore;
import Location.SafeHouse.SafeHouse;
import Location.Cave;
import Location.Forest;
import Location.River;

import java.util.Scanner;

public class Game {
    private Scanner scanner = new Scanner(System.in);
    private Player player;
    private Location location;

    // game starts with this method
    public void start() throws InterruptedException {
        System.out.println("➡ Welcome to Advanture Game ⬅");
        System.out.print("Enter a name: ");
        String name = scanner.nextLine();
        player = new Player(name);
        System.out.println(player.getName() + " welcome to game");
        player.selectChar();
        Location location = null;
        boolean exit = false;
        while (!exit) {
            player.printPlayerInfo();
            System.out.println();
            System.out.println("######### Regions #########");
            System.out.println();
            System.out.println("1-Safe House\n2-Tool Store\n3-Cave\n4-Forest\n5-River\n6-Mine\n0-Exit");
            System.out.print("Please select the region you want to go to: ");
            int selectLoc = scanner.nextInt();
            switch (selectLoc) {
                case 0:
                    exit = true;
                    break;
                case 1:
                    location = new SafeHouse(player);
                    if (new SafeHouse(player).isWin()) {
                        System.out.println("🎉 Congratulations you won the game 🎉");
                        return;
                    }
                    break;
                case 2:
                    location = new ToolStore(player);
                    break;
                case 3:
                    if (player.getInventory().isFood()) {
                        continue;
                    }
                    location = new Cave(player);
                    break;
                case 4:
                    if (player.getInventory().isFirewood()) {
                        continue;
                    }
                    location = new Forest(player);
                    break;
                case 5:
                    if (player.getInventory().isWater()) {
                        continue;
                    }
                    location = new River(player);
                    break;
                case 6:
                    location = new Mine(player);
                    break;
                default:
                    System.out.println("Please enter a valid region");
                    location = new SafeHouse(player);
            }
            if (exit) {
                Thread.sleep(2000);
                System.out.println("Game is ending...");
                break;
            }
            if (!location.onLocation()) {
                System.out.println("!!! Game Over !!!");
                break;
            }
        }
    }

}
