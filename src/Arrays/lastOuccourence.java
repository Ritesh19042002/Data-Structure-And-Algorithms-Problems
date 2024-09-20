package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class lastOuccourence {

    public static int last(int[] arr,int x){
        int recent = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==x){
                recent = i;
            }
        }
        return recent;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }
        int x = sc.nextInt();

        System.out.println("last occurence : "+last(arr,x));;
    }
}
