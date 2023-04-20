import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class TrexStore {
    private Map<Notebook,Phone> products;
    private static Scanner scanner = new Scanner(System.in);
    public TrexStore(){
        this.products=new HashMap<>();
    }
    public void run() {
        System.out.println("Trex Product Management Panel");
        System.out.println("1-Notebook Transactions" +
                "\n2-Mobile Phone Transactions" +
                "\n3-List Brand" +
                "0-Exit");
        int input = scanner.nextInt();
        System.out.println("Your preference: "+input);
        switch (input){
            case 1:

        }
    }

}
