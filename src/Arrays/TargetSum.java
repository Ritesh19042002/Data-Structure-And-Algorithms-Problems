package Arrays;

import java.util.Scanner;

public class TargetSum {
    public static int sum(int[] arr,int target){
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {//first number
            for (int j = i+1; j < arr.length; j++) {//second number
                if (arr[i]+arr[j]==target){
                    ans++;
                }
            }
        }
        System.out.println("Your target sum is :"+ans);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Length :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Input Array numbers :");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter Target : ");
        int target = sc.nextInt();
        sum(arr,target);
    }
}
