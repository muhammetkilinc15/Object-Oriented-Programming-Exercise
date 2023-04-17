package Location;
import Player.Player;
import Obstacle.Vampire;

public class Forest extends BattleLoc {
    public Forest(Player player) {
        super(player, "Forest", new Vampire(), "firewood",3);
    }


}
