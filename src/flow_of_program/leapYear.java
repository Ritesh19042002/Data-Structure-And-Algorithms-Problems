package flow_of_program;
import java.util.*;
public class leapYear {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year");
        int year = sc.nextInt();
        if(year%4 == 0)
            System.out.println("This is Leap year");
        else
            System.out.println("This is not Leap year");
    }
}