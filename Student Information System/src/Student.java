import java.text.DecimalFormat;

public class Student {
    private String name;
    private String studentNo;
    private int classes;
    private Course calculus;
    private Course objectOriented;
    private Course physic;
    private double average;
    boolean isPass;

    public Student(String name, String studentNo, int classes, Course calculus, Course objectOriented, Course physic) {
        this.name = name;
        this.studentNo = studentNo;
        this.classes = classes;
        this.calculus = calculus;
        this.objectOriented = objectOriented;
        this.physic = physic;
    }

    public String getName() {
        return name;
    }

    public void addBulkExamNote(int calcMidterm, int calcFinal, int objectOrientedMidterm, int objectOrientedFinal, int physicMidterm, int physicFinal) {

        boolean isValidCalc = (calcMidterm >= 0 && calcMidterm <= 100) && (calcFinal >= 0 && calcFinal <= 100);
        boolean isValidObjectOrient = (objectOrientedMidterm >= 0 && objectOrientedMidterm <= 100) && (objectOrientedFinal >= 0 && objectOrientedFinal <= 100);
        boolean isValidPhysic = (physicMidterm >= 0 && physicMidterm <= 100) && (physicFinal >= 0 && physicFinal <= 100);

        if (isValidCalc && isValidObjectOrient && isValidPhysic) {
            this.calculus.setMidtermExam(calcMidterm);
            this.calculus.setFinalExam(calcFinal);
            this.objectOriented.setMidtermExam(objectOrientedMidterm);
            this.objectOriented.setFinalExam(objectOrientedFinal);
            this.physic.setMidtermExam(physicMidterm);
            this.physic.setFinalExam(physicFinal);
        } else {
            System.out.println("Invalid course grade value entered");
        }
    }

    public boolean isPass() {
        if (getAverage() > 50) {
            this.isPass = true;
            return true;
        }
        return false;
    }

    public Course getCalculus() {
        return calculus;
    }

    public Course getObjectOriented() {
        return objectOriented;
    }

    public Course getPhysic() {
        return physic;
    }

    public double getAverage() {
        double averageOfCalculus = getCalculus().getMidtermExam() * 0.20 + getCalculus().getFinalExam() * 0.80;
        double averageOfObjectOriented = getObjectOriented().getMidtermExam() * 0.20 + getObjectOriented().getFinalExam() * 0.80;
        double averageOfPhysic = getPhysic().getMidtermExam() * 0.20 + getPhysic().getFinalExam() * 0.80;
        this.average = (averageOfCalculus + averageOfPhysic + averageOfObjectOriented) / 3.0;
        return average;
    }

    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        String isPassClass = "";
        isPassClass += "Average: " + decimalFormat.format(getAverage()) + "\n";
        boolean conditionOne = getCalculus().getMidtermExam() != 0 && getObjectOriented().getMidtermExam() != 0 && getPhysic().getMidtermExam() != 0;
        boolean conditionTwo = getCalculus().getFinalExam() != 0 && getObjectOriented().getFinalExam() != 0 && getPhysic().getFinalExam() != 0;
        if (conditionOne && conditionTwo) {
            if (isPass) {
                isPassClass += getName() + " passed the class";
            } else {
                isPassClass += getName() + " failed the class";
            }
            return "\n===============================" +
                    "\nStudent: " + this.name +
                    "\nCalculus Midterm Exam: " + this.calculus.getMidtermExam() +
                    "\nCalculus Final Exam: " + this.calculus.getFinalExam() +
                    "\nObject Oriented Programming Midterm Exam:  " + this.objectOriented.getMidtermExam() +
                    "\nObject Oriented Programming Final Exam:  " + this.objectOriented.getFinalExam() +
                    "\nPhysic Midterm Exam: " + this.physic.getMidtermExam() +
                    "\nPhysic Final Exam: " + this.physic.getFinalExam() +
                    "\n" + isPassClass + "\n";

        } else {

            return "\n" + getName() + "'s some lesson notes is invalid !!! ";
        }
    }
}
