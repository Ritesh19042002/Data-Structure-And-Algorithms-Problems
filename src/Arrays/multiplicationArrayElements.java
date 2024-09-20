package Arrays;

import java.util.Scanner;

public class multiplicationArrayElements {

    public static int multi(int[] arr,int n){
        int[] b = new int[50];
        int p = 1;
        for (int i = 0; i < n; i++) {
            p=p*arr[i];
            b[i]=p;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(b[i]+" ");
        }
        return p;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }

        multi(arr,n);

    }
}
