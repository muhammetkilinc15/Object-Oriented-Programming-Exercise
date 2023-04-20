import java.util.Date;

public class RegularTicket extends Ticket{
    private double price;

    public RegularTicket(Date date) {
        super(date);
        this.price = 10;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
