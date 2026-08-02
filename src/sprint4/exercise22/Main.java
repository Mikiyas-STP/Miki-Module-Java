package sprint4.exercise22;

public class Main {
    public static void main(String[] args){

        String[] firstNames = { "Anuket", "Eryn", "Filip", "Raquel", "John", "Jane" };
        String[] lastNames = { "Hassan", "Doe", "Pappas", "Clarke", "Jones", "Jones" };
        int[] grades = {22, 45, 35, 22, 41, 39};

        StudentDataProcessor processor = new StudentDataProcessor( firstNames, lastNames, grades);
        System.out.println(processor.getStudentToGrade());
    }
}