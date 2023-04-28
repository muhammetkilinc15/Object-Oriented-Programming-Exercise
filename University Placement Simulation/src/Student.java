import java.util.Arrays;

public class Student {
    private String name;
    private double score;
    private int numberOfPreferences;
    int[] preferences;
    static int numberOfStudents;

    public Student(String name, double score) {
        this.preferences = new int[3];
        this.name = name;
        this.score = score;
    }

    public void addPreference(int universityID) {
        preferences[numberOfPreferences] = universityID;
        numberOfPreferences++;
    }

    @Override
    public String toString() {
        String preference = "";
        for (int i = 0; i < numberOfPreferences; i++) {
            preference += preferences[i] + "\n";
        }
        return "Student's name: " + name +
                "\n\t\tscore=" + score +
                "\nThis student have " + numberOfPreferences + " preferences which are " +
                "\n" + preference;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public int[] getPreferences() {
        return preferences;
    }

    public void setPreferences(int[] preferences) {
        this.preferences = preferences;
    }
}
