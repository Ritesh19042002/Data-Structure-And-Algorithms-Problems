package String;
import java.util.*;
import java.lang.*;
public class Palindrome {

    public static boolean palindromeString(String a){
        boolean palindrome = false;
        String b = "";
        for (int i = a.length()-1; i >= 0 ; i--) {
            b = b + a.charAt(i);
        }
        if(a.equals(b)){
            palindrome = true;
        }else {
            palindrome = false;
        }
        return palindrome;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        boolean str = palindromeString(a);
        if(str == true){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not palindrome");
        }
    }
}
