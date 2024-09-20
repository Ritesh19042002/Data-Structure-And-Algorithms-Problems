package Arrays;

import java.util.Scanner;

public class noOfTimensElement {

    public static int elememt(int[] arr,int x){
        int count =0;
        for (int i = 0; i < arr.length; i++) {
            if(x==arr[i]){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }
        int x = sc.nextInt();

        System.out.println("Count is :"+elememt(arr,x));


    }
}
