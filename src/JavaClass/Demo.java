package JavaClass;

import java.util.*;
public class Demo {

    public static void swap(int a, int b){
//        a = a^b;
//        b = a^b;
//        a = a^b;
        a = (a+b) - (b=a);
        System.out.println(a);
        System.out.println(b);
    }
    static int max_version1(int a, int b){
        return (a>b)?a:b;
    }
    static int max_version2(int a, int b){
        return Math.max(a,b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.print("Enter b : ");
        int b = sc.nextInt();

        swap(a,b);
        System.out.println("Maximum number is : "+ max_version1(a,b));
        System.out.println("Maximum number is : "+ max_version2(a,b));

    }
}
