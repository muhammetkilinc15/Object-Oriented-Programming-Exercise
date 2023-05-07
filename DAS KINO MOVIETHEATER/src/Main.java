public class Main {
    public static void main(String[] args) {


        Movie movie1= new Movie("Burning","Lee Chang-dong",2018,148);
        Movie movie2= new Movie("Spirited Away","Hayao Miyazaki",2001,125);
        Movie movie3= new Movie("Once upon a time in Anatolia","Nuri Bilge Ceylan",2011,157);
        Movie movie4= new Movie("In the mood for love","Wong Kar-wai",2000,98);


        Hall hallOne= new Hall(1,50);
        Hall hallTwo=new Hall(2,20);
        Hall hallThree= new Hall(3,100);

        Session session1= new Session(movie1,hallOne,"Monday","12:00");
        Session session2= new Session(movie1,hallTwo,"Monday","15:00");
        Session session3= new Session(movie1,hallOne,"Friday","15:00");

        Client client = new Client("Muhammet Kılınç",111253614,21);
        Client client1= new Client("Dilara Nihadiogğlu",111253614,25);
        Client client2= new Client("Nisa Nur Hurç",117253614,11);
        Client client3= new Client("Kayra Kaan Kabakçıoğlu",119253614,17);

        
        Reservation reservation1= new Reservation(client1,session2,5);
        Reservation reservation2= new Reservation(client2,session2,2);
        Reservation reservation3= new Reservation(client3,session2,3);







    }
}