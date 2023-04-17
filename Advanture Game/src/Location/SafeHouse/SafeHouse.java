package Location.SafeHouse;

import Location.NormalLoc;
import Player.Player;

public class SafeHouse extends NormalLoc {
    public SafeHouse(Player player){
        super(player,"Safe House");
    }

    @Override
    public boolean onLocation() {
        System.out.println("⏺ You are in the safe house");
        System.out.println("Your spirit is renewed");
        this.getPlayer().setHealthy(getPlayer().getOrijinalHealth());
        return true;
    }
    public boolean isWin(){
        return getPlayer().getInventory().isFirewood() && getPlayer().getInventory().isFood() && getPlayer().getInventory().isWater();
    }
}
