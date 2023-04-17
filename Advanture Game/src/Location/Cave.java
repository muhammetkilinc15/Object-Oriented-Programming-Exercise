package Location;

import Obstacle.Obstacle;
import Player.Player;
import Obstacle.Zombie;

public class Cave extends  BattleLoc{
    public Cave(Player player) {
        super(player, "Cave",new Zombie(),"food",3);
    }
}
