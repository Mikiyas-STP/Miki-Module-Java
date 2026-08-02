package sprint4.exercise22;
import java.util.HashMap;
import java.util.Map;

public class StudentDataProcessor {

    private String[] firstNames;
    private String[] lastNames;
    private int[] grades;

    public StudentDataProcessor(String[] firstNames, String[] lastNames, int[] grades){
        this.firstNames = firstNames;
        this.lastNames = lastNames;
        this.grades = grades;
    }

    public Map<Student, Integer> getStudentToGrade(){
        Map<Student, Integer> studentGrades = new HashMap<>();
        for (int i = 0; i < firstNames.length; i++) {
            Student student = new Student(firstNames[i], lastNames[i] );
            studentGrades.put(student, grades[i]);

        }
        return studentGrades;
    }


}
