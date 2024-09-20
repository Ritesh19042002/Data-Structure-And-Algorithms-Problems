package String;

import java.util.*;
import java.lang.*;

public class Anagram {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        a = a.toLowerCase();
        b = b.toLowerCase();

        boolean ret = false;

        if(a.length()!=b.length()){
            return ret;
        }

        char[] string1 = a.toCharArray();
        char[] string2 = b.toCharArray();

        Arrays.sort(string1);
        Arrays.sort(string2);

        if(Arrays.equals(string1, string2) == true){
            ret = true;
        }else{
            ret = false;
        }

        return ret;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}

