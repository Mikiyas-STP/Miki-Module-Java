package sprint4.exercise21;
import java.util.*;

public class StudentDataProcessor {

    private String[] firstNames;
    private String[] lastNames;
    private int[] grades;

    public StudentDataProcessor(String[] firstNames,
                                String[] lastNames,
                                int[] grades){
        this.firstNames = firstNames;
        this.lastNames = lastNames;
        this.grades = grades;
    }

    public List<String> getFirstNames(){

        List<String> names = new ArrayList<>();

        for(String name : firstNames){
            names.add(name);
        }
        return names;
    }
    public Set<String> getDistinctFirstNames() {

        Set<String> names = new HashSet<>();

        for (String name : firstNames) {
            names.add(name);
        }

        return names;
    }

    public Set<String> getDistinctFirstNamesInAlphabeticalOrder() {

        return new TreeSet<>(Arrays.asList(firstNames));

    }

    public Map<String, Integer> getLastNameToGrade() {

        Map<String, Integer> gradesMap = new HashMap<>();

        for (int i = 0; i < lastNames.length; i++) {
            gradesMap.put(lastNames[i], grades[i]);
        }

        return gradesMap;
    }


}
