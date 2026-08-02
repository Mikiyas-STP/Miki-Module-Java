package sprint4.exercise23;
import sprint4.exercise22.*;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        String[] firstNames = {"Anuket", "Eryn", "Filip", "Raquel", "Eryn"};
        String[] lastNames = {"Hassan", "Doe", "Pappas", "Clarke", "Jones"};
        int[] grades = {22, 45, 35, 22, 41};

        StudentDataProcessor processor = new StudentDataProcessor( firstNames, lastNames, grades);

        /**
         * collections
         */
        List<String> names = processor.getFirstNames();
        Set<String> uniqueNames = processor.getDistinctFirstNames();
        Set<String> sortedNames = processor.getDistinctFirstNamesInAlphabeticalOrder();
        Map<Student, Integer> students = processor.getStudentToGrade();



    }

}
