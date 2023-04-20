public class Coffe {
    String type; // americano 10 , latte 15 , filtre 0
    String size; // small , medium, large
    String heat; // ice cold
    double price;

    public Coffe(){
        this.type="Filtre";
        this.price=0;
    }

    public Coffe(String type, String size, String heat) {
        this.type = type;
        this.size = size;
        this.heat = heat;
    }


    public double heat(String heat){

        return 2;
    }
}
