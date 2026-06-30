//sum calculator for debugging purpose
public class Main {
    public static void main(String[] args) {
        int sum = 0;

        // BUG: Loop starts at -1 instead of 1
        for (int i = -1; i <= 100; i++) {
            sum += i;
        }

        System.out.println("The sum is: " + sum);
    }
}
