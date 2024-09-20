package Arrays;

import java.util.Scanner;

public class PrifixSum {

    static void printArray(int[] arr){
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    static int[] makePrifixSumArray(int[] arr){
        int n = arr.length;
        int[] pref = new int[n];
        pref[0] = arr[0];

        for (int i = 1; i < n; i++) {
            pref[i] = pref[i-1]+arr[i];
        }
        return pref;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }
        printArray(arr);

        int[] pref = makePrifixSumArray(arr);
        printArray(pref);

    }
}
