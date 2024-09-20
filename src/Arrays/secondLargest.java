package Arrays;

import java.util.Scanner;

public class secondLargest {

    static int findMax(int[] arr){
        int mx = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>mx){
                mx=arr[i];
            }
        }
        return mx;
    }

    static int secondMax(int[] arr){
        int mx = findMax(arr);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == mx){
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int secondMax = findMax(arr);
        return secondMax;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter Array Elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Max element is : "+findMax(arr));
        System.out.println("Second Max is : "+ secondMax(arr));
    }
}
