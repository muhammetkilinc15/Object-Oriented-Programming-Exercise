package Location.ToolStore;

public class Weapon {
    private String name;
    private int id;
    private int damage;
    private int money;

    public Weapon(String name, int id, int damage, int money) {
        this.name = name;
        this.id = id;
        this.damage = damage;
        this.money = money;
    }
    public static Weapon[] weopons(){
        Weapon[] weaponList=new Weapon[3];
        weaponList[0]=new Weapon("Gun",1,2,5);
        weaponList[1]=new Weapon("Sword",2,3,35);
        weaponList[2]=new Weapon("Rifle",3,7,45);
        return weaponList;
    }

    public String getName() {
        return name;
    }
    public static Weapon getWeaponObjById(int id){
        for (Weapon w:Weapon.weopons()) {
            if (id==w.getId()){
                return w;
            }
        }
        return null;
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

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
