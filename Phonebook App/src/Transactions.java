import java.util.Collections;

public class Transactions extends PhoneBook {
    public Transactions() {

    }

    public void saveNumber() {
        scanner.nextLine();
        System.out.print("Please enter name: ");
        String name = scanner.nextLine();
        System.out.print("Please enter surname: ");
        String surname = scanner.nextLine();
        System.out.print("Please enter phone number: ");
        String phoneNumber = scanner.nextLine();
        if (isPersonExist(phoneNumber) == -1) {
            this.getPersons().add(new Person(name, surname, phoneNumber));
        } else {
            System.out.println("This number is registered in the directory!!!\n\n");
        }
    }


    // Metot -1 döndürüyor ise inputtaki kişi yoktur !!!
    public int isPersonExist(String input) {
        for (int i = 0; i < getPersons().size(); i++) {
            if (getPersons().get(i).getName().equalsIgnoreCase(input) || getPersons().get(i).getPhoneNumber().equals(input) || getPersons().get(i).getSurname().equalsIgnoreCase(input)) {
                return i;
            }
        }
        return -1;
    }

    public void deleteNumber() {
        scanner.nextLine();
        while (true) {
            System.out.print("\nPlease enter the name or surname of the person whose number you want to delete: ");
            String input = scanner.nextLine();
            if (isPersonExist(input) != -1) {
                System.out.printf("{%s} is about to be deleted from the directory, do you confirm?(y/n)", input);
                String answer = scanner.nextLine();
                if (answer.equals("y")) {
                    getPersons().remove(getPersons().get(isPersonExist(input)));
                    break;
                }
            } else {
                System.out.println("Data matching your search criteria could not be found in the directory. Please make a selection");
                System.out.println("* To end the deletion: (1)\n* To try again: (2)");
                int a = scanner.nextInt();
                if (a == 2) {
                    break;
                }
            }
        }
    }

    public void updateNumber() {
        scanner.nextLine();
        boolean exit = false;
        while (!exit) {
            System.out.print("Please enter the name or surname of the person whose number you want to update: ");
            String input = scanner.nextLine();
            if (isPersonExist(input) != -1) {
                System.out.print("Enter a new number: ");
                String newNumber = scanner.nextLine();
                getPersons().get(isPersonExist(input)).setPhoneNumber(newNumber);
                break;
            } else {
                System.out.println("Data matching your search criteria could not be found in the directory. Please make a selection: ");
                System.out.println("* To end the update (1)\n* to try again (2)");
                int a = scanner.nextInt();
                if (a == 2) {
                    exit = true;
                }
            }
        }
    }

    public void listingDirectory() {
        System.out.println("\nTelephone directory");
        System.out.println("*********************************************************************");

        for (int i = 0; i < getPersons().size(); i++) {
            for (int j = 0; j < getPersons().size(); j++) {
                if (getPersons().get(i).getName().compareTo(getPersons().get(j).getName()) < 0) {
                    Collections.swap(getPersons(), i, j);
                }
            }
        }
        for (int i = 0; i < getPersons().size(); i++) {
            System.out.printf("Name { %s } Surname { %s } Phone Number { %s } \n", getPersons().get(i).getName(), getPersons().get(i).getSurname(), getPersons().get(i).getPhoneNumber());
        }
        System.out.println("*********************************************************************");
    }

    public void searchDirectory() {
        scanner.nextLine();
        System.out.print("Select the type you want to search");
        System.out.println("\n1-To search by first or last name\n2-To search by phone number");
        int operation = scanner.nextInt();
        scanner.nextLine();
        if (operation == 1) {
            System.out.print("Enter name or surname: ");
            String nameOrSurname = scanner.nextLine();
            System.out.println("Your Search Results: ");
            for (int i = 0; i < getPersons().size(); i++) {
                if (getPersons().get(i).getName().equalsIgnoreCase(nameOrSurname) || getPersons().get(i).getSurname().equalsIgnoreCase(nameOrSurname)) {
                    System.out.printf("Name {%s} Surname {%s} Phone Number {%s} \n", getPersons().get(i).getName(), getPersons().get(i).getSurname(), getPersons().get(i).getPhoneNumber());
                }
            }
        } else if (operation == 2) {
            System.out.print("Enter phone: ");
            String phoneNumber = scanner.nextLine();

            if (isPersonExist(phoneNumber) == -1) {
                System.out.println(" There is no one registered with the number " + phoneNumber);

            } else {
                System.out.println("Your Search Results: ");
                for (int i = 0; i < getPersons().size(); i++) {
                    if (getPersons().get(i).getPhoneNumber().equals(phoneNumber)) {
                        System.out.printf("Name {%s} Surname {%s} Phone Number {%s} \n", getPersons().get(i).getName(), getPersons().get(i).getSurname(), getPersons().get(i).getPhoneNumber());
                    }
                }
            }
        } else {
            System.out.println("Invalid entered !!!");
        }
    }
}
