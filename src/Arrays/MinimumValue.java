package Arrays;
import java.util.*;
import java.lang.*;
public class MinimumValue {
    public static int minValue(int[] numbers){

        if (numbers == null || numbers.length == 0){
            throw new IllegalArgumentException("Invalid Input");
        }

        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] < min){
                min = numbers[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int a = minValue(arr);
        System.out.println("The minimum value is : " + a);
    }
}
