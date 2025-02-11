package String;

import java.util.Scanner;

//Given a string , the task is to toggle all the character of the string to convert upper case to lower case
//and vice versa
//Input: riTEsH output: RIteSh
public class Toggle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());
        System.out.println(str);

        for (int i = 0; i < str.length(); i++) {
            boolean flag = true;// true -> capital
            char ch = str.charAt(i);
            if(ch == ' ') continue;
            int asci = (int)ch;
            if (asci>=97) flag = false;
            if (flag == true){
                asci += 32;
                char dh = (char)asci;
                str.setCharAt(i,dh);
            }
            else {
                asci -= 32;
                char dh = (char)asci;
                str.setCharAt(i,dh);
            }
        }
        System.out.println(str);
    }
}
