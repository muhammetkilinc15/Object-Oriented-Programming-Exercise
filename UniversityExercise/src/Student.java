import java.util.PropertyResourceBundle;

public class Student extends Person {
    public static final String FRESHMAN = "FRESHMAN";
    public static final String SOPHOMORE = "SOPHOMORE";
    public static final String JUNIOR = "JUNIOR";
    public static final String SENIOR = "SENIOR";
    private String status;

    public Student() {
    }

    public Student(String name) {
        super(name);
    }

    public Student(String name, String adress, String phone, String mail, String status) {
        super(name, adress, phone, mail);
        this.status = status;
    }

    public String toString() {
        return super.toString() + "Status: " + status+"\n";
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

