import java.util.Date;

public class Ticket {
    private Date eventDate;

    public Ticket(Date date) {
        eventDate = date;
    }

    public double getPrice(){

        return 0;

    }
    public String toString() {

        return " Date: " + eventDate.toString() + "\nPrice: " + getPrice() + "\n";

    }
}
