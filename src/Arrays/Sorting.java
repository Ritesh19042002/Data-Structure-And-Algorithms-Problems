package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Sorting {
    public static boolean isSorted(int[] arr){
        boolean check = true;

        for(int i = 1;i<arr.length;i++){
            //arr[1]<arr[0];
            if(arr[i]<arr[i-1]){
                check=false;
                break;
            }
        }
        return check;
    }

    public static void sorting(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                int temp = 0;
                if(arr[j]<arr[i]){
                    temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static void kthSmallestAndLargest(int[] arr){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of K");
        int k = sc.nextInt();
        int small = 0;
        int large = 0;
        for(int i = 0; i < k; i++){
            small = arr[i];
        }
        System.out.println("Smallest "+ k +" is :"+ small);

        for (int i = arr.length; i>=k; i--){
            large = arr[i];
        }
        System.out.println("Largest "+ k +" is :"+ large);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }
        System.out.println("Is Sorted :"+isSorted(arr));
        System.out.println("Sorted Elements are :");
        sorting(arr);
        kthSmallestAndLargest(arr);

    }
}
