package sprint4.exercise21;

public class Main {
    public static void main(String[] args){

        String[] firstNames = { "Anuket", "Eryn", "Filip", "Raquel", "Eryn" };
        String[] lastNames = { "Hassan", "Doe", "Pappas", "Clarke", "Jones" };
        int[] grades = { 22, 45, 35, 22, 41 };

        StudentDataProcessor processor = new StudentDataProcessor(firstNames, lastNames, grades);
        System.out.println("First Names:");
        System.out.println(processor.getFirstNames());
        System.out.println();

        System.out.println("Distinct First Names:");
        System.out.println(processor.getDistinctFirstNames());
        System.out.println();

        System.out.println("Distinct First Names Alphabetical:");
        System.out.println(processor.getDistinctFirstNamesInAlphabeticalOrder());
        System.out.println();

        System.out.println("Last Names -> Grades");
        System.out.println(processor.getLastNameToGrade());
    }
}
