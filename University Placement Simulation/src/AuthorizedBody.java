import java.util.Arrays;
import java.util.Collections;

public class AuthorizedBody {
    University[] universities;
    Student[] students;
    String[] referenceResults;
    int numberOfUniversities;

    public AuthorizedBody() {
        this.universities = new University[100];
        this.students = new Student[100];
        this.referenceResults = new String[20];
    }

    public void addStudent(Student student) {
        students[Student.numberOfStudents] = student;
        Student.numberOfStudents++;
    }

    public void addUniversity(University university) {
        universities[numberOfUniversities] = university;
        numberOfUniversities++;
    }

    public void sortStudents() {
        for (int i = 0; i < Student.numberOfStudents; i++) {
            for (int j = i + 1; j < Student.numberOfStudents; j++) {
                if (students[i].getScore() > students[j].getScore()) {
                    Student temp = students[j];
                    students[j] = students[i];
                    students[i] = temp;
                }
            }
        }
    }

    public void placeStudents() {
        boolean isFlag;
        for (int i = Student.numberOfStudents-1; i >= 0; i--) {
            isFlag=true;
            for (int j=0;j<numberOfUniversities;j++){
                for (int m=0;m<numberOfUniversities;m++){
                    if (students[i].preferences[j]==universities[m].getId() && universities[m].getQuota()!=0){
                        referenceResults[i]=universities[m].getName();
                        universities[m].decreaseQuota();
                        isFlag=false;
                        break;
                    }
                }
                if (!isFlag){
                    break;
                }
            }
        }
    }

    public String printStudents() {
        String result = "";
        for (int i = 0; i < Student.numberOfStudents; i++) {
            result += students[i].getName() + " with score: " + students[i].getScore() + "\n";
        }
        return result;
    }

    public String printUniversities() {
        String result = "";
        for (int i = 0; i < numberOfUniversities; i++) {
            result += universities[i].getName() + " with ID:" + universities[i].getId() + "\n";

        }
        return result;
    }
    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i <Student.numberOfStudents; i++) {
            result += students[i].getName() + " got into "+referenceResults[i]+ "\n";
        }
        return result;
    }
}
