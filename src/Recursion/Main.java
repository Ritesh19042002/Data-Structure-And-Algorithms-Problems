package Recursion;

import java.util.Scanner;
public class Main {
    public static int factorial(int n) {
        // Base case: factorial of 0 is 1
        if (n == 0)
            return 1;
        // Recursive case: multiply n with factorial of (n-1)
        return n * factorial(n - 1);
    }
    public static void main(String[] args) {
        //Case 1
        int number = 6;
        System.out.println("Number is: " + number);
        //Case 2
        if (number < 0) {
            System.out.println("Error: Factorial is undefined for negative numbers.");
            System.exit(1);
        }
        int result = factorial(number);
        //print the output
        System.out.println("Factorial of " + number + " is: " + result);
    }
}
