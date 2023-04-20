import java.util.Date;

public class StudentReservedSeat extends ReservedSeat {
    public StudentReservedSeat(Date date, int rowNumber, int seatNumber) {
        super(date, rowNumber, seatNumber);
    }
    @Override
    public double getPrice() {
        return super.getPrice() - 5;
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
