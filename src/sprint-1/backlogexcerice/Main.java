//Create a private method to print all prime numbers up to 1000. Call this from a main method.
//Remember to use sensible method and variable names, and add documentation where necessary!

//Learning Objectives
//Create a private Java method to print all prime numbers up to 1000
//Call this method from a Main method


public class Main {

    private static boolean isPrime(int n) {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}