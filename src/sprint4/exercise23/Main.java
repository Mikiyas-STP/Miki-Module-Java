package sprint4.exercise23;
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

        //creating
        names.add("Miki");
        uniqueNames.add("Miki");
        sortedNames.add("Miki");
        Student mike = new Student("Miki", "Smith");
        students.put(mike, 50);

        //deleting
        names.remove("Filip");
        uniqueNames.remove("Filip");
        sortedNames.remove("Filip");
        Student filip = new Student("Filip", "Pappas");
        students.remove(filip);

        //update
        Student eryn = new Student("Eryn", "Doe");
        students.put(eryn, 0);

        System.out.println(names);
        System.out.println(uniqueNames);
        System.out.println(sortedNames);
        System.out.println(students);

    }
}