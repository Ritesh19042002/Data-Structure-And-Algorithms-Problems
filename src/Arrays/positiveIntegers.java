package Arrays;

import java.util.Scanner;

//Given an array of integers {2, 6, -5, -1, 0, 4, -9}, print only the positive values present in the array.
//Output:
//2
//6
//0
//4
public class positiveIntegers {
    void printOddString(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String[] arr = new String[a];

        for(int i=0;i<arr.length;i++){
            arr[i]= sc.nextLine();
        }

        for(int i=0;i<arr.length;i++){
            if(i%2!=0){
                System.out.print(arr[i]+" ");
            }
        }
    }

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int[] arr = new int[a];
//
//        for(int i = 0;i< arr.length;i++){
//            arr[i]=sc.nextInt();
//        }
//
//        for(int val:arr){
//            if(val>0){
//                System.out.println(val);
//            }
//        }

        positiveIntegers obj = new positiveIntegers();
        obj.printOddString();
    }
}
