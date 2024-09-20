package Methods;

import java.util.Scanner;

public class Algebra {
    int add(int a,int b){
        int sum = a+b;
        return sum;
    }

    public static void main(String[] args) {
        Algebra obj = new Algebra();
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = obj.add(a, b);
        System.out.println(sum);
    }
}

