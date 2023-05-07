import java.util.Random;
import java.util.Scanner;

public class Reservation {
    Session session;
    Client client;
    int cost;
    int ticketPrice;
    int numOfTickets;
    int[] seatsBooked;

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
            int randomSeatNumber = random.nextInt(reservation.session.hall.capacity);
            if (reservation.session.hall.seats[randomSeatNumber] == 'U') {
                reservation.seatsBooked[i] = randomSeatNumber;
                reservation.session.hall.seats[randomSeatNumber] = 'B';
            } else {
                i--;
            }
        }
        return reservation;
    }

    public Reservation bookASeatBySeatNumber(Reservation reservation, int numOfBookedTickets, int[] wantedSeats) {
        for (int i = 0; i < numOfBookedTickets; i++) {
            reservation.session.hall.seats[wantedSeats[i]] = 'B';
            seatsBooked[i] = wantedSeats[i];
        }
        return reservation;
    }

    public void createReservation(Reservation reservation) {

        System.out.println("Hello " + reservation.client.name + " your member ship status is " + reservation.client.checkMemberShip(client.member_id));
        System.out.println("Enter number of tickets that you wanna book\n" + reservation.numOfTickets);

        if (reservation.client.checkMemberShip(client.member_id)) {
            int[] wantedSeats = new int[reservation.numOfTickets];
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the seat number of tickets tht you wanna book between 0 to " + reservation.session.hall.capacity);

            // With this loop, seat numbers are retrieved from the user.
            for (int i = 0; i < reservation.numOfTickets; i++) {
                int seatNumber = scanner.nextInt();

                // If an invalid seat number is entered, a warning is issued.
                if (seatNumber < 0 || seatNumber >= reservation.session.hall.capacity) {
                    System.out.println("You entered an invalid seat number !");
                    i--;
                    continue;
                }

                // If the entered seat number has already been reserved, a warning is given.
                if (reservation.session.hall.seats[seatNumber] == 'B') {
                    System.out.println("This seat has already been reserved !");
                    i--;
                    continue;
                }

                // Here the user is prevented from re-entering the seat number entered
                boolean isFlag = true;
                for (int wantedSeat : wantedSeats) {
                    if (wantedSeat == seatNumber && i != 0) {
                        isFlag = false;
                        i--;
                        break;
                    }
                }
                if (isFlag) {
                    wantedSeats[i] = seatNumber;
                }else {
                    System.out.println("you have already entered this seat number");
                }
            }
            reservation = bookASeatBySeatNumber(reservation, numOfTickets, wantedSeats);

        } else {
            reservation = bookASeatRandom(reservation, reservation.numOfTickets);
        }

        System.out.printf("Your reservation to %s on  %s at %s for %d people successfully made.Your seat number are: \n", reservation.session.movie.name, reservation.session.day, reservation.session.time, reservation.numOfTickets);
        for (int i = 0; i < reservation.seatsBooked.length; i++) {
            System.out.print(reservation.seatsBooked[i] + " ");
        }

        reservation.cost = calculateCost(reservation);
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
