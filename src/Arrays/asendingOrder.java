package Arrays;

import java.util.Scanner;

public class asendingOrder {

    public static int order(int[] arr){
        int temp =0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }


        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i< arr.length;i++){
            arr[i]= sc.nextInt();
        }
        order(arr);
    }
}
