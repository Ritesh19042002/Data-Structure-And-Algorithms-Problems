//Question
//You are given a number n ,representing a count of elements.
//You are given n numbers.
//You are required to find span of input. Span is defined as difference of maximum value and minimum.


package Arrays;

import java.util.Scanner;


public class SpanOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        int span = max - min;

        System.out.println(span);
    }
}
