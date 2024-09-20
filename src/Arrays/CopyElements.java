package Arrays;

import java.util.*;

public class CopyElements {

    static int[] elementsForCopy(int[] arr){
        int n = arr.length;
        int[] arr1 = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[i];
        }

        return arr1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int[] arr = new int[s];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int[] array = elementsForCopy(arr);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
