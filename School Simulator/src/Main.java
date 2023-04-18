public class Main {
    public static void main(String[] args) {

        // Create a Person, Student, Employee, Faculty, and Staff objects
        Person person = new Person("ALex", "12 Bell street", "3473339999", "alex12@aol.com");

        Student student = new Student("Bella", "Antalya", "32144512", "bella@gmail.com", Student.FRESHMAN);

        Employee employee = new Employee("David", "Istanbul", "45662256", "david34@gmail.com", "1030", 2045.12, new MyDate());

        Faculty faculty= new Faculty("Sue","Berlin","78856556","sue_12@gmail.com","101",5000,new MyDate(),"4pm to 6pm","Professor");

        Staff staff = new Staff("Faruk","Moscova","45456464","faruk_01@gmail.com","91",7500,new MyDate(),"Assistant");


        System.out.println(person.toString());

        System.out.println(student.toString());

        System.out.println(employee.toString());

        System.out.println(faculty.toString());

        System.out.println(staff.toString());

    }
}