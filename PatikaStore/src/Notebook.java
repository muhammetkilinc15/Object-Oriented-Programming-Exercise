import java.util.HashMap;

public class Notebook extends ProductMenager {
    public static HashMap<Integer, ProductMenager> ourNotebooks = new HashMap<>();

    public Notebook(String name, Brand brandOfPruduct, double screenSize, double battaryPower, int memory, int ram, String color, int price, int quality, int discountRate) {
        super(name, brandOfPruduct, screenSize, battaryPower, memory, ram, color, price, quality, discountRate);
        ourNotebooks.put(this.getId(), this);
    }

}
