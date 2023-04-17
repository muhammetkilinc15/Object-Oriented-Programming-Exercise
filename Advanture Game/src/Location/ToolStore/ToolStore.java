package Location.ToolStore;

import Location.Location;
import Location.NormalLoc;
import Player.Player;

public class ToolStore extends NormalLoc {

    public ToolStore(Player player) {
        super(player, "Tool Store");
    }

    @Override
    public boolean onLocation() {

        boolean exit = true;
        while (exit) {
            System.out.println("\n----- 🚧 ToolStore 🚧-----");
            System.out.println("1-Weapons\n2-armors\n3-Exit");
            System.out.println("Select an operating: ");
            int input = Location.scanner.nextInt();
            while (input < 1 || input > 3) {
                System.out.print("Invalid process,try again enter a value: ");
                input = Location.scanner.nextInt();
            }
            switch (input) {
                case 1:
                    printWeapon();
                    buyWeapon();
                    break;
                case 2:
                    printArmor();
                    buyArmor();
                    break;
                case 3:
                    exit = false;
                    break;
            }
        }

        return true;
    }
    public void printWeapon() {
        System.out.println("\n              🛠 Weapons 🛠");
        System.out.println("----------------------------------------");
        System.out.println("| Weapon    |  ID  |  Damage |  Money  |");
        for (Weapon w : Weapon.weopons()) {
            System.out.println("----------------------------------------");
            System.out.printf("|  %-8s |  %-3s |    %-4s |   %-5s |\n", w.getName(), w.getId(), w.getDamage(), w.getMoney());
        }
        System.out.println("----------------------------------------");
        System.out.println("4-Exit: ");
    }
    public void buyWeapon() {
        while (true) {
            System.out.print("Select an weapon: ");
            int selectWeopen = Location.scanner.nextInt();
            if (selectWeopen == 4) {
                break;
            }
            while (selectWeopen < 1 || selectWeopen > Weapon.weopons().length) {
                System.out.print("Invalid process,try again enter a value: ");
                selectWeopen = Location.scanner.nextInt();
            }
            Weapon selectedWeapon = Weapon.getWeaponObjById(selectWeopen);
            if (selectedWeapon != null) {
                if (selectedWeapon.getMoney() > this.getPlayer().getMoney()) {
                    System.out.println("insufficient balance,Your balance is "+getPlayer().getMoney());
                } else {
                    // The weapon purchase takes place here
                    System.out.println("you bought a " + selectedWeapon.getName());
                    int balance = getPlayer().getMoney() - selectedWeapon.getMoney();
                    this.getPlayer().setMoney(balance);
                    System.out.println("Remaining money: " + this.getPlayer().getMoney());
                    this.getPlayer().getInventory().setWeapon(selectedWeapon);
                    System.out.println();
                }
            }
        }
    }

    public void printArmor() {
        System.out.println("\n              🛠 Armor 🛠");
        System.out.println("----------------------------------------");
        System.out.println("| Armor    |  ID  |  Block |  Money  |");
        for (Armor a : Armor.armors()) {
            System.out.println("----------------------------------------");
            System.out.printf("|  %-8s |  %-3s |    %-4s |   %-5s |\n", a.getName(), a.getId(), a.getBlock(), a.getMoney());
        }
        System.out.println("----------------------------------------");
        System.out.println("4-Exit: ");
    }

    public void buyArmor() {
        while (true) {
            System.out.print("⏺ Select an armor: ");
            int selectArmor = Location.scanner.nextInt();
            if (selectArmor == 4) {
                break;
            }
            while (selectArmor < 1 || selectArmor > Weapon.weopons().length) {
                System.out.print("Invalid process,try again enter a value: ");
                selectArmor = Location.scanner.nextInt();
            }
            Armor selectedArmor = Armor.getWeaponObjById(selectArmor);
            if (selectedArmor != null) {
                if (selectedArmor.getMoney() > this.getPlayer().getMoney()) {
                    System.out.println("insufficient balance");
                } else {
                    // Armor purchase takes place here
                    System.out.println("you bought a " + selectedArmor.getName());
                    int balance = getPlayer().getMoney() - selectedArmor.getMoney();
                    this.getPlayer().setMoney(balance);
                    System.out.println("Remaining money: " + this.getPlayer().getMoney());
                    this.getPlayer().getInventory().setArmor(selectedArmor);
                    System.out.println();
                }
            }
        }
    }
}
