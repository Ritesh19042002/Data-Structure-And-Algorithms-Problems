package Arrays;

import java.util.Scanner;

public class maxElement {

    void max(){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int[] arr = new int[m];

        for(int i = 0; i< arr.length;i++){
            arr[i] = sc.nextInt();
        }

        int max = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }

        int min = arr[0];
        for(int i=0;i< arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }

        System.out.println("max : "+max);
        System.out.println("min : "+min);
    }
    public static void main(String[] args) {
        maxElement obj = new maxElement();
        obj.max();
    }
}
