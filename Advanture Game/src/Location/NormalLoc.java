package Location;

import Player.Player;

public abstract class NormalLoc extends Location {
    private Player player;
    private String name;

    public NormalLoc(Player player,String name) {
        super(player,name);
    }



    // Normal location da ölmicez !!!
    @Override
    public boolean onLocation(){
        return true;
    }

}
