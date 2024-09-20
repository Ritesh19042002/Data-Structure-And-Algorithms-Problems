package Arrays;
import java.util.*;
import java.lang.*;
public class ReverceArray {
    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

    public static int[] reverceArrayElements(int[] array){
        int start = 0;
        int end = array.length-1;
        while(start<end){
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
        return array;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        printArray(array);
        int[] reverceNumbers = reverceArrayElements(array);
        System.out.println(Arrays.toString(reverceNumbers));
    }
}
