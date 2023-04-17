package Location;

import Obstacle.Bear;
import Player.Player;

public class River extends BattleLoc{
    public River(Player player){
        super(player,"River",new Bear(),"water",2);
    }
}
