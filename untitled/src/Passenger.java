public class Passenger {
    private String name;
    private int age;
    private double ticketPrice;
    private boolean isStudent;
    static int numberOfPassengers;

    public Passenger(String name, int age, double ticketPrice, boolean isStudent) {
        this.name = name;
        this.age = age;
        this.ticketPrice = ticketPrice;
        this.isStudent = isStudent;
        numberOfPassengers++;
    }

    public String displayInfo() {
        return "Name: " + name + " Age: " + age + " Ticket Price: " + ticketPrice + " Student Info: " + isStudent;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public static int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
