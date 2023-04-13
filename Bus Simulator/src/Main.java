public class Main {
    public static void main(String[] args) {


        Bus bus1= new Bus(100,50,0.2);
        bus1.addPassenger("Murat",25,true);
        bus1.addPassenger("Ayse",33,false);
        bus1.addPassenger("Şenay",21,true);

        System.out.println("Total number of passengers: "+bus1.addPassenger("Burak",45,true));
        bus1.changeMotionState();
        System.out.println("Total number of passengers: "+bus1.addPassenger("Ceren",37,true));
        bus1.displayBusInfo();


    }
}