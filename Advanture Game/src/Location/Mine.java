package Location;

import Location.BattleLoc;
import Obstacle.Snake;
import Player.Player;

public class Mine extends BattleLoc {
    public Mine(Player player) {
        super(player,"Mine",new Snake(),"",5);
    }
}
