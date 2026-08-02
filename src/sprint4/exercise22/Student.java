package sprint4.exercise22;
import java.util.Objects;
public class Student {
    private String firstName;
    private String lastName;

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        public String getFirstName () {
            return firstName;
        }
        public String getLastName () {
            return lastName;
        }
        @Override
        public boolean equals (Object obj){
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Student other = (Student) obj;
            return Objects.equals(firstName, other.firstName) && Objects.equals(lastName, other.lastName);
        }
        @Override
        public int hashCode () {
            return Objects.hash(firstName, lastName);
        }
        @Override
        public String toString () {
            return firstName + " " + lastName;
        }
    }
}
