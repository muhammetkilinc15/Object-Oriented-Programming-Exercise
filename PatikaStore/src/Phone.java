import java.util.HashMap;

public class Phone extends ProductMenager {
    public static HashMap<Integer, ProductMenager> ourTelephones =new HashMap<>();


    public Phone(String name, Brand brandOfPruduct, double screenSize, double battaryPower, int memory, int ram, String color, int price, int quality, int discountRate) {
        super(name, brandOfPruduct, screenSize, battaryPower, memory, ram, color, price, quality, discountRate);
        ourTelephones.put(this.getId(),this);
    }
}
