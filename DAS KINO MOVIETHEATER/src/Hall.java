import java.util.Arrays;

public class Hall {
    public int hall_id;
    public int capacity;
    public char[] seats;

    public Hall() {

    }

    public Hall(int hall_id, int capacity) {
        this.hall_id = hall_id;
        this.capacity = capacity;
        this.seats = new char[capacity];
        fillHallUnBooked(seats);
    }

    public void fillHallUnBooked(char[] seats) {
        Arrays.fill(seats, 'U');
    }
}
