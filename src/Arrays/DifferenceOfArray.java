/*
1. You have given a number n1,representing the size of array a1.
2. You have given n1 numbers,representing the size of array a1.
3. You have given a number n2,representing the size of array a2.
4. You have given n2 numbers,representing the size of array a2.
5. The two arrays represents digits of two numbers .
6. You are required to find the difference of two numbers represented by two arrays and print the arrays
a2-a1

   Assumption number represented by a2 is greater
*/

package Arrays;

import java.util.Scanner;

public class DifferenceOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] a1 = new int[n1];

        for (int i = 0; i < a1.length; i++) {
            a1[i] = sc.nextInt();
        }

        int n2 = sc.nextInt();
        int[] a2 = new int[n2];

        for (int i = 0; i < a2.length; i++) {
            a2[i] = sc.nextInt();
        }

        int[] diff = new int[n2];
        int c = 0;

        int i = a1.length - 1;
        int j = a2.length - 1;
        int k = diff.length - 1;

        while (k >= 0) {
            int d = 0;
            int a1v = i >= 0 ? a1[i] : 0;
            if (a2[j] + c >= a1v) {
                d = a2[j] + c - a1v;
                c = 0;
            } else {
                d = a2[j] + c + 10 - a1v;
                c = -1;
            }

            diff[k] = d;
            i--;
            j--;
            k--;
        }
    int idx = 0;
        while(idx< diff.length){
            if (diff[idx] == 0) {
                idx++;
            }else{
                break;
            }
        }
        while (idx< diff.length){
            System.out.print(diff[idx]);
            idx++;
        }
    }
}
