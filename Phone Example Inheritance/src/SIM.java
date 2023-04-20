public class SIM {
    private String number;
    private String[] numbers;
    public int numberOfNumbers;
    public static int maxNumber = 100;

    public SIM(String number) {
        this.number = number;
        this.numbers = new String[maxNumber];
    }

    public String getSIM_Number() {
        return this.number;
    }

    public String getAllNumbers() {
        String all = "";
        for (int i = 0; i < this.numberOfNumbers; i++) {
            all += this.numbers[i] + "\n";
        }
        return all;
    }

    public int addNumber(String newNumber) {
        this.numbers[this.numberOfNumbers++] = newNumber;
        return this.numberOfNumbers;
    }

    public String toString() {
        return "Number: " + this.number + "\nAll added numbers: \n" + this.getAllNumbers();
    }
}
