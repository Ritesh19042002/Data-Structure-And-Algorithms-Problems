package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class peakElement {
    public static void sort012(int[] arr,int n){

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }

        sort012(arr,n);

    }
}
