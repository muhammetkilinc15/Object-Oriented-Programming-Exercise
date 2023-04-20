import java.util.Date;

public class ReservedSeat extends Ticket {
    private int rowNumber;
    private int seatNumber;
    public ReservedSeat(Date date, int seatNumber,int rowNumber) {
        super(date);
        this.rowNumber = rowNumber;
        this.seatNumber = seatNumber;
    }
    @Override
    public double getPrice() {
        if (this.rowNumber >= 1 && this.rowNumber <= 15) {
            return 30;
        }else {
            return 20;
        }
    }
    @Override
    public String toString() {
        return "seat_number= " + this.seatNumber + ", row_number= " + this.rowNumber + super.toString();
    }
}
