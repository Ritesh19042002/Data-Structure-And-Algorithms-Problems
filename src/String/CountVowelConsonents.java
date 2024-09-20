package String;
import java.lang.*;
import java.util.*;
public class CountVowelConsonents {
//Java Program to count the total number of vowels and consonants in a string
    public static void countVowel(String str){
        int vcount = 0;
        int ccount = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e'|| str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' ) {
                vcount++;
            }else if (str.charAt(i)>='a' && str.charAt(i)<= 'z'){
                ccount++;
            }
        }
        System.out.println("Number of Vowels : " + vcount);
        System.out.println("Number of Consonents : "+ ccount);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = "This is a really simple sentence";
        countVowel(string);

    }
}
