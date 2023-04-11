public class Main {
    public static void main(String[] args) throws InterruptedException {

        Course calculus = new Course("Calculus", "MATH103", "CALC");
        Course objectOriented = new Course("Object Oriented Programming", "SEN110", "OOP");
        Course physic = new Course("Physic", "PHY102", "PHY");

        Teacher t1 = new Teacher("Prof.Dr. Hazard Clein", "905212211103", "CALC");
        Teacher t2 = new Teacher("Prof.Dr.Brenden Eich", "905131130989", "OOP");
        Teacher t3 = new Teacher("Dr. David Lut", "905131130989", "PHY");

        calculus.addTeacher(t1);
        objectOriented.addTeacher(t2);
        physic.addTeacher(t3);


        // First Student is Mark Zuckerberg
        Student student1 = new Student("Mark Zuckerberg", "210129012", 1, calculus, objectOriented, physic);
        student1.addBulkExamNote(60,70,50,1010,90,60);
        System.out.println(student1.toString());

        // Second Student is Maria Juice
        Student student2 = new Student("Maria Juice", "210129015", 1, calculus, objectOriented, physic);
        student2.addBulkExamNote(45,74,30,60,70,90);
        System.out.println(student2.toString());

        // Third Student is Jessica Clark
        Student student3 = new Student("Jessica Clark", "210129068", 1, calculus, objectOriented, physic);
        student3.addBulkExamNote(70,80,86,85,60,70);
        System.out.println(student3.toString());

    }
}