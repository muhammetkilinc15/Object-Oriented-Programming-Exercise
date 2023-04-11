public class Course {
    private String name;
    private String code;
    private String prefix;
    private int midtermExam;
    private int finalExam;
    private Teacher courseTeacher;
    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.midtermExam = 0;
        this.finalExam=0;
    }

    public void addTeacher(Teacher teacher) {
        if (this.prefix.equals(teacher.getBranch())) {
            this.courseTeacher = teacher;
            System.out.println("Transaction successful");
        } else {
            System.out.println(teacher.getName() + " academician branch is not compatible with this course");
        }
    }

    public String getName() {
        return name;
    }

    public int getFinalExam() {
        return this.finalExam;
    }

    public int getMidtermExam() {
        return midtermExam;
    }

    public void setMidtermExam(int midtermExam) {
        this.midtermExam = midtermExam;
    }
    public void setFinalExam(int finalExam){
        this.finalExam=finalExam;
    }

    public void printTeacher() {
        if (courseTeacher != null) {
            System.out.println(courseTeacher.getName() + " academician is of " + this.name + " course");
        } else {
            System.out.println(getName() + " lecturer appointed");
        }

    }
}
