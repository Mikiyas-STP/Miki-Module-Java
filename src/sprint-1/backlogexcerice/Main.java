//Create a private method to print all prime numbers up to 1000. Call this from a main method.
//Remember to use sensible method and variable names, and add documentation where necessary!

//Learning Objectives
//Create a private Java method to print all prime numbers up to 1000
//Call this method from a Main method


public class Main {

    public static void main(String[] args) {
        primePrinter(1000);
    }

    /**
     * Prints all prime numbers from 2 up to value.
     */
    private static void primePrinter(int value) {
        for (int i = 2; i < value; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    /**
     * Check if a number is prime.
     */
    private static boolean isPrime(int n) {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}