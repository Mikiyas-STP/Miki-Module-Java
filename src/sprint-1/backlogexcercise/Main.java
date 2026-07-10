//Create a private method that accepts a number as an argument
//and returns the number in reverse. For example, an input of 3956 should return 6593.
//Create code to call this from from a main method.
//Remember to use sensible method and variable names, and add documentation.
//Remember to use the debugger if something goes wrong!
//Learning Objectives
//Create a private Java method to reverse numbers
//Call this method from a Main method

public class Main{

    public static void main(String[] args){
        System.out.println(reverseNum(3956));
    }
    /**
     * Reverses a given integer number
     */
    private static int reverseNum(int number){

        //checking if my number is negative if it is I change it to positive for simpler calclulation
        boolean isNegative = number < 0;
        if (isNegative){
            number = -number;
        }

        int reversed = 0;

        while (number > 0){
            reversed = reversed * 10 + number % 10;
            number = number / 10;
        }
        //here if the number were negative i should add the sign back and used this simple technique
        if(isNegative){
            reversed = - reversed;
        }

        return reversed;
    }
}