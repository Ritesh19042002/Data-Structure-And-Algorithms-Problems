package Numbers;

import java.util.Scanner;

public class ExtractingNumbers {

    public static int countNumbers(int num){
        int count = 0;
        while (num > 0){
            int lastDigit = num % 10;
            count++;
            num = num / 10;
        }
        return count;
    }

    public static class Numbers{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            int number = countNumbers(n);
            System.out.println(number);
        }
    }
}
