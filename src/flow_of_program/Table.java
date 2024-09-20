package flow_of_program;
import java.util.*;
public class Table {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Printing the multiplication table
        System.out.println("Multiplication table for " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }

        scanner.close();
    }
}
