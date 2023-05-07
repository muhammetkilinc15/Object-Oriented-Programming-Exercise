import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class BookStore {

    public static void main(String[] args) {
        BookStoreClerk clerk = new BookStoreClerk();
        File inputFile = new File("src/books.txt");
        File outputFile = new File("log.txt");

        try {
            Scanner scanner = new Scanner(inputFile);
            PrintWriter writer = new PrintWriter(outputFile);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println("Given input from file: " + line);
                try {
                    Book book = clerk.readAndValidateBook(line);
                    System.out.println(book.toString());
                    writer.println(book);
                } catch (InvalidBookException e) {
                    System.out.println("Cannot create the book instance!");
                    System.out.println(e.getClass().getSimpleName() + " : " + e.getMessage());
                    System.out.println("Please modify the input file ");
                }
                System.out.println("\n------------------------------------------------\n");
            }
            scanner.close();
            writer.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}