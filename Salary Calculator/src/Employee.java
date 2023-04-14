public class Employee {
    private String name;
    private double salary;
    private int workHours;
    private int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        double tax = 0;
        if (this.salary > 1000) {
            tax = salary * 0.03;
            return tax;
        }
        return 0;
    }
    public double bonus() {
        double bonus = 0;
        if (this.workHours > 40) {
            bonus = (this.workHours - 40) * 30;
        }
        return bonus;
    }
    public double raiseSalary() {
        int differenceYear = 2021 - hireYear;
        double increaseSalary = 0;
        if (differenceYear > 19) {
            increaseSalary = salary * 0.15;
        } else if (differenceYear > 10) {
            increaseSalary = salary * 0.10;
        } else {
            increaseSalary = salary * 0.05;
        }
        return increaseSalary;
    }

    public String toString() {
        return "Name: " + name +
                "\nSalary: " + this.salary +
                "\nWork hours: " + this.workHours +
                "\nHire Year: " + this.hireYear +
                "\nTax: " + tax() +
                "\nBonus: " + bonus() +
                "\nSalary increase: " + (raiseSalary()) +
                "\nSalary with Taxes and Bonuses: " + (this.salary + bonus() - tax()) +
                "\nTotal salary: " + (salary + raiseSalary());
    }
}
