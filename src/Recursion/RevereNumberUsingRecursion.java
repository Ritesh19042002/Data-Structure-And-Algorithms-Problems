package Recursion;
import java.util.*;
public class RevereNumberUsingRecursion {

    public static void Revercenumber(int num){
        if(num < 10){
            System.out.println(num);
            return;
        }
        else {
            System.out.print(num % 10);
            Revercenumber(num / 10);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int number = sc.nextInt();
        Revercenumber(number);
    }
}
