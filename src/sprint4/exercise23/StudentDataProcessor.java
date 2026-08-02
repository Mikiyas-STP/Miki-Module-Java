package sprint4.exercise23;
import java.util.*;

public class StudentDataProcessor {
    private String[] firstNames;
    private String[] lastNames;
    private int[] grades;

    public StudentDataProcessor(
            String[] firstNames,
            String[] lastNames,
            int[] grades) {
        this.firstNames = firstNames;
        this.lastNames = lastNames;
        this.grades = grades;
    }
    public List<String> getFirstNames() {
        List<String> names = new ArrayList<>();
        for(String name : firstNames){
            names.add(name);
        }
        return names;
    }
    public Set<String> getDistinctFirstNames() {
        Set<String> names = new HashSet<>();
        for(String name : firstNames){
            names.add(name);
        }
        return names;
    }
    public Set<String> getDistinctFirstNamesInAlphabeticalOrder(){
        Set<String> names = new TreeSet<>();
        for(String name : firstNames){
            names.add(name);
        }
        return names;
    }
    public Map<Student,Integer> getStudentToGrade(){
        Map<Student,Integer> students =
                new HashMap<>();
        for(int i = 0; i < firstNames.length; i++){
            Student student =
                    new Student(
                            firstNames[i],
                            lastNames[i]
                    );
            students.put(student, grades[i]);
        }
        return students;
    }
}