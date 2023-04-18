import java.util.Date;
import java.util.EmptyStackException;
import java.util.PropertyResourceBundle;

public class Employee extends Person {
   private String office;
   private double salary;
   private MyDate dateHired;

   public Employee(){
       super("?","?","?","?");
   }
    public Employee(String name) {
        super(name);
    }

    public Employee(String name, String adress, String phone, String mail, String office, double salary, MyDate dateHired) {
        super(name, adress, phone, mail);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDateHired() {
       String result= dateHired.getDay() +"/"+dateHired.getMonth()+"/"+dateHired.getYear();
        return result;
    }

    public void setDateHired(MyDate dateHired) {
        this.dateHired = dateHired;
    }
    public String toString(){
       return super.toString()+"Office: "+office+
               "\nDate: "+getDateHired()+"\n";
    }
}
