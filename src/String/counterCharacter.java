package String;

import java.util.Scanner;

public class counterCharacter {
    static void counterChar(String string){
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if(string.charAt(i) != ' '){
                count++;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        String A = "The best of both worlds";
        counterChar(A);
    }
}