import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Account {
    private String name;
    private int id;
    private double balance;
    private static double annualInterestRate;
    private Date dateCreated;
    private ArrayList<Transactions> transaction;

    public Account() {
        this.name = "";
        this.balance = 0;
        annualInterestRate = 0;
        dateCreated = new Date();
        transaction = new ArrayList<>();

    }

    public Account(int id, double balance) {
        this.name = "";
        this.id = id;
        this.balance = balance;
        dateCreated = new Date();
        transaction = new ArrayList<>();
    }

    public Account(String name, int id, double balance) {
        this.name = name;
        this.id = id;
        this.balance = balance;
        transaction = new ArrayList<>();
        dateCreated = new Date();
    }

    public void deposit(double amount) {
        transaction.add(new Transactions('D', amount, balance, "Deposit to account"));
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (this.balance - amount > 0) {
            this.balance -= amount;
            transaction.add(new Transactions('W', amount, balance, "Withdrawal form account"));
        }
    }

    public double getMonthlyInterestRate() {

        return annualInterestRate / 12.0;
    }

    public double getMonthlyInterest() {
        return balance * (getMonthlyInterestRate() / 100);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public ArrayList<Transactions> getTransaction() {
        return transaction;
    }

    public void setTransaction(ArrayList<Transactions> transaction) {
        this.transaction = transaction;
    }
}
