package Arrays;
import java.util.*;
import java.lang.*;
public class removeEven {

    public static int[] removeEvenElements(int[] array){
        int oddCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0){
                oddCount++;
            }
        }
            int[] result = new int[oddCount];
            int idx = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[j] % 2 != 0){
                    result[idx] = array[j];
                    idx++;
                }
            }
            return result;

    }

    public static void main(String[] args) {
        int[] array = {3,2,4,7,10,6,5};
        int[] newArray = removeEvenElements(array);
        System.out.println(Arrays.toString(newArray));
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i]+" ");
        }
    }
}
