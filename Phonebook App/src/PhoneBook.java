import java.util.ArrayList;
import java.util.Scanner;

public class PhoneBook {
    private ArrayList<Person> people;
    protected static Scanner scanner = new Scanner(System.in);

    public PhoneBook() {
        this.people = new ArrayList<>();
        people.add(new Person("ALex", "Santos", "05397791239"));
        people.add(new Person("Mike", "Smith", "05459991999"));
        people.add(new Person("Oliver", "Mathews", "05347741414"));
        people.add(new Person("Tanya", "Fleming", "05418111221"));
        people.add(new Person("Darwin", "Hamilton", "05433337393"));
    }

    public void run() {
        Transactions transaction = new Transactions();
        boolean exit = false;
        while (!exit) {
            try {
                System.out.println("\n----------------------------------");
                System.out.println("1-Registering a New Number\n2-Deleting an Existing Number" +
                        "\n3-Updating an Existing Number" +
                        "\n4-Listing the Directory" +
                        "\n5-Searching the Directory" +
                        "\n6-Exit");
                System.out.println("----------------------------------");
                System.out.print("Please select the action you want to do :");
                int operation = scanner.nextInt();
                switch (operation) {
                    case 1:
                        transaction.saveNumber();
                        break;
                    case 2:
                        transaction.deleteNumber();
                        break;
                    case 3:
                        transaction.updateNumber();
                        break;
                    case 4:
                        transaction.listingDirectory();
                        break;
                    case 5:
                        transaction.searchDirectory();
                        break;
                    case 6:
                        System.out.println("Exiting the directory...");
                        exit = true;
                        break;
                }

            } catch (Exception e) {
                System.out.println(e.getClass().getSimpleName());
                break;
            }
        }
    }
    public ArrayList<Person> getPersons() {
        return people;
    }
    public void setPersons(ArrayList<Person> people) {
        this.people = people;
    }
}
