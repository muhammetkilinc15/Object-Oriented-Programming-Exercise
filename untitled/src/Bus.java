public class Bus {
    private Passenger[] passengers;
    private int capacity;
    private double discountRate;
    private double normalTicketPrice;
    private boolean isInMotion;

    public Bus(int capacity, double normalTicketPrice, double discountRate) {
        this.capacity = capacity;
        this.normalTicketPrice = normalTicketPrice;
        this.discountRate = discountRate;
        this.passengers = new Passenger[capacity];
        this.isInMotion = true;
    }

    public int addPassenger(String name, int age, boolean isStudent) {
        double ticketPrice=normalTicketPrice;
        if (isInMotion && Passenger.getNumberOfPassengers() < capacity) {
            if(isStudent){
                ticketPrice=normalTicketPrice - (normalTicketPrice * discountRate);
            }

            Passenger passenger = new Passenger(name, age, ticketPrice, isStudent);
            passengers[Passenger.getNumberOfPassengers() - 1] = passenger;
        }
        return Passenger.getNumberOfPassengers();
    }

    public double totalPrice() {
        double totalPrice = 0;
        for (int i = 0; i < Passenger.numberOfPassengers; i++) {
            totalPrice += passengers[i].getTicketPrice();
        }
        return totalPrice;
    }

    public String nameOfTheOldestPerson() {
        if (Passenger.numberOfPassengers != 0) {
            return "";
        }
        Passenger oldestPassenger = passengers[0];
        for (int i = 1; i < Passenger.numberOfPassengers; i++) {
            if (passengers[i].getAge() > oldestPassenger.getAge()) {
                oldestPassenger = passengers[i];
            }
        }
        return oldestPassenger.getName();
    }
    public boolean changeMotionState() {
        if (isInMotion){
            isInMotion=false;
        }else {
            isInMotion=true;
        }
        return isInMotion;
    }
    public void displayBusInfo() {
        System.out.println("Passenger list: ");
        for (int i=0;i<Passenger.getNumberOfPassengers();i++){
            System.out.println(passengers[i].displayInfo());
        }
        System.out.println("Total Price: " + totalPrice());
        System.out.println("Name pf the oldest person: " + nameOfTheOldestPerson());
    }
}