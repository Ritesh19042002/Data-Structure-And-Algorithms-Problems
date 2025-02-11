package Arrays;

import java.util.Scanner;

// Given an array a sorted in non-decreasing order, return an array of squares of each number sorted in non-decreasing order.
public class nonDecreasingOrder {

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void reverce(int[] arr){
        int i = 0; int j = arr.length-1;
        while(i<j){
            swap(arr, i, j);
            i++;
            j--;
        }
    }

    static int[] sortSquares(int[] arr){
        int n = arr.length;
        int left = 0; int right = n-1;
        int[] ans = new int[n];
        int k = 0;

        while(left<right){
            if(Math.abs(arr[left]) > Math.abs(arr[right])){
                ans[k++] = arr[left]*arr[left];
                left++;
            }else{
                ans[right] = arr[right]*arr[right];
                right--;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }

        return ans;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int[] ans = sortSquares(arr);

    }
}
