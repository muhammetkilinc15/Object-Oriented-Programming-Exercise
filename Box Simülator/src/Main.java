public class Main {
    public static void main(String[] args) {

        Fighter f1= new Fighter("Muhammed Ali",12,100,100,70);
        Fighter f2= new Fighter("Mike Tayson",10,90,95,5);


        Match match = new Match(f1,f2,85,120);
        match.run();





    }
}