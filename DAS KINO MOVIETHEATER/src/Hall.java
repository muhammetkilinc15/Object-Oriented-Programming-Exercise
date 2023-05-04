import java.util.Arrays;

public class Hall {
    private int hall_id;
    private int capacity;
    private char[] seats;

    public Hall() {

    }
    public Hall(int hall_id, int capacity) {
        this.hall_id = hall_id;
        this.capacity = capacity;
        this.seats=new char[capacity];
        fillHallUnBooked(seats);
    }
    public void fillHallUnBooked(char[] seats){
        Arrays.fill(seats, 'U');
    }
    public int getHall_id() {
        return hall_id;
    }
    public int getCapacity() {
        return capacity;
    }
    public char[] getSeats() {
        return seats;
    }
}
