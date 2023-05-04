import java.util.Random;
import java.util.Scanner;

public class Reservation {
    private Session session;
    private Client client;
    private int cost;
    private int ticketPrice;
    private int numOfTickets;
    private int[] seatsBooked;

    public Reservation() {

    }

    public Reservation(Client client, Session session, int numOfTickets) {
        this.session = session;
        this.client = client;
        this.numOfTickets = numOfTickets;
        this.seatsBooked = new int[numOfTickets];
        this.ticketPrice = 100;
        createReservation(this);
    }

    public Reservation bookASeatRandom(Reservation reservation, int numOfBookedTickets) {
        Random random = new Random();
        for (int i = 0; i < numOfBookedTickets; i++) {
            int randomSeatNumber = random.nextInt(0, reservation.session.hall.getCapacity());
            if (reservation.session.hall.getSeats()[randomSeatNumber] != 'B') {
                reservation.seatsBooked[i] = randomSeatNumber;
                reservation.session.hall.getSeats()[randomSeatNumber] = 'B';
            } else {
                i--;
            }
        }
        return reservation;
    }

    public Reservation bookASeatBySeatNumber(Reservation reservation, int numOfBookedTickets, int[] wantedSeats) {
        for (int i = 0; i < numOfBookedTickets; i++) {
            reservation.session.hall.getSeats()[wantedSeats[i]] = 'B';
        }
        return reservation;
    }

    public void createReservation(Reservation reservation) {
        System.out.println("Hello " + reservation.client.name + " your member ship status is " + reservation.client.checkMemberShip(client.member_id));
        System.out.println("Enter number of tickets that you wanna book\n" + reservation.numOfTickets);
        if (reservation.client.checkMemberShip(client.member_id)) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the seat number of tickets tht you wanna book between 0 to " + reservation.session.hall.getCapacity());
            int[] wantedSeats = new int[reservation.numOfTickets];
            for (int i = 0; i < reservation.numOfTickets; i++) {
                int seatNumber = scanner.nextInt();
                if (seatNumber < 0 || seatNumber > reservation.session.hall.getCapacity() || reservation.session.hall.getSeats()[seatNumber] == 'B') {
                    i--;
                    continue;
                }
                for (int j = 0; j < wantedSeats.length; j++) {
                    if (wantedSeats[j] == seatNumber) {
                        i--;
                        continue;
                    }
                }
                wantedSeats[i] = seatNumber;
                seatsBooked[i] = seatNumber;
            }
            reservation = bookASeatBySeatNumber(reservation, numOfTickets, wantedSeats);

        } else {
            reservation = bookASeatRandom(reservation, reservation.numOfTickets);
        }
        reservation.cost = calculateCost(reservation);
        System.out.printf("Your reservation to %s on  %s at %s for %d people successfully made.Your seat number are: \n", reservation.session.movie.name, reservation.session.day, reservation.session.time, reservation.numOfTickets);
        for (int i = 0; i < reservation.seatsBooked.length; i++) {
            System.out.print(reservation.seatsBooked[i] + " ");
        }
        System.out.println(" Your ticket cost is: " + reservation.cost);

    }

    public int calculateCost(Reservation reservation) {
        for (int i = 0; i < reservation.numOfTickets; i++) {
            if (reservation.client.checkMemberShip(client.member_id)) {
                reservation.cost += reservation.ticketPrice * 80 / 100;
            } else if (reservation.client.age < 18) {
                reservation.cost += reservation.ticketPrice * 95 / 100;
            } else {
                reservation.cost += reservation.ticketPrice;
            }

        }
        return reservation.cost;
    }
}