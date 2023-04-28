public class Main {
    public static void main(String[] args) {
        AuthorizedBody OSYM = new AuthorizedBody();

        University university1 = new University("Stanford", 1);
        university1.setQuota(3);

        University university2 = new University("MIT", 2);
        university2.setQuota(5);

        University university3 = new University("NYU", 3);
        university3.setQuota(10);

        OSYM.addUniversity(university1);
        OSYM.addUniversity(university2);
        OSYM.addUniversity(university3);

        Student student1 = new Student("Jack", 60);
        student1.addPreference(1);
        student1.addPreference(3);
        student1.addPreference(2);
        OSYM.addStudent(student1);


        Student student2 = new Student("Morgan", 86);
        student2.addPreference(2);
        student2.addPreference(3);
        student2.addPreference(1);
        OSYM.addStudent(student2);

        Student student3 = new Student("Tom", 90);
        student3.addPreference(1);
        student3.addPreference(2);
        student3.addPreference(3);
        OSYM.addStudent(student3);

        Student student4 = new Student("Hailey", 95);
        student4.addPreference(3);
        student4.addPreference(2);
        student4.addPreference(1);
        OSYM.addStudent(student4);

        Student student5 = new Student("Mike", 25);
        student5.addPreference(1);
        student5.addPreference(3);
        student5.addPreference(2);
        OSYM.addStudent(student5);

        Student student6 = new Student("Emma", 40);
        student6.addPreference(2);
        student6.addPreference(1);
        student6.addPreference(3);
        OSYM.addStudent(student6);

        Student student7 = new Student("Natalia", 64);
        student7.addPreference(1);
        student7.addPreference(3);
        student7.addPreference(2);
        OSYM.addStudent(student7);

        Student student8 = new Student("Scott", 84);
        student8.addPreference(1);
        student8.addPreference(2);
        student8.addPreference(2);
        OSYM.addStudent(student8);

        Student student9 = new Student("Lily", 100);
        student9.addPreference(3);
        student9.addPreference(1);
        student9.addPreference(2);
        OSYM.addStudent(student9);

        Student student10 = new Student("Emily", 36);
        student10.addPreference(3);
        student10.addPreference(2);
        student10.addPreference(1);
        OSYM.addStudent(student10);

        // System.out.println(OSYM.printStudents());
        System.out.println(student1.toString());
        System.out.println(university1.toString());

        System.out.println(OSYM.printUniversities());
        System.out.println("Students before sorting: ");
        System.out.println(OSYM.printStudents());

        OSYM.sortStudents();
        System.out.println("Students after sorting: ");
        System.out.println(OSYM.printStudents());

        OSYM.placeStudents();
        System.out.println(OSYM.toString());
    }
}