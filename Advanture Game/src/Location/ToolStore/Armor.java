package Location.ToolStore;

public class Armor {
    private String name;
    private int id;
    private int block;
    private int money;

    public Armor(String name, int id, int block, int money) {
        this.name = name;
        this.id = id;
        this.block = block;
        this.money = money;
    }
    public static Armor[] armors(){
        Armor[] armorList=new Armor[3];
        armorList[0]=new Armor("Light",1,2,15);
        armorList[1]=new Armor("Middle",2,3,25);
        armorList[2]=new Armor("Heavy",3,5,40);
        return armorList;
    }
    public static Armor getWeaponObjById(int id){
        for (Armor a:Armor.armors()) {
            if (id==a.getId()){
                return a;
            }
        }
        return null;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBlock() {
        return block;
    }

    public void setBlock(int block) {
        this.block = block;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
