import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Brand {
    private String name;
    private static List<Brand> list=new ArrayList<>();
    private static int nextID = 1;
    private int id;

    public Brand(String name) {
        this.id=nextID;
        this.name = name;
        if (nextID>9){
            list.add(this);
        }
        nextID++;
        list.sort(Comparator.comparing(Brand::getName));
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

    static {
        list.add(new Brand("Samsung"));
        list.add(new Brand("Lenovo"));
        list.add(new Brand("Apple"));
        list.add(new Brand("Huawei"));
        list.add(new Brand("Casper"));
        list.add(new Brand("Asus"));
        list.add(new Brand("HP"));
        list.add(new Brand("Xiomi"));
        list.add(new Brand("Monster"));
        list.sort(Comparator.comparing(Brand::getName));
    }
}
