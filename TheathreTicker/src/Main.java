import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Ticket t = new RegularTicket(new Date());
        System.out.println(t.toString());

        Ticket t1 = new ReservedSeat(new Date(),5,5);
        System.out.println(t1.toString());

        Ticket t2 = new ReservedSeat(new Date(),5,25);
        System.out.println(t2.toString());

        Ticket t3 = new StudentReservedSeat(new Date(),5,15);
        System.out.println(t3.toString());
    }
}