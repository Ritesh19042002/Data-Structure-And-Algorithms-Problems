
package Arrays;

import java.util.*;
import java.lang.*;

public class LinearSearch {

    static int linearSearch1(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }

        for (int index = 0; index < arr.length; index++) {
            // check for element for every index if it is == Target
            int element = arr[index];
            if(element == target){
                return index;
            }
        }

        return -1;
    }

    static boolean search(String str, char target1){
        if(str.length() == 0){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if(target1 == str.length()){
                return true;
            }
        }
        return false;
    }

    static boolean search2(String str, char target2){
        if(str.length() == 0){
            return false;
        }
        for (char ch : str.toCharArray()) {
            if (ch == target2){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums = {2, 4, 5, 14 , 23, 6 ,3 ,12};
        int target = 23;
        String name = "Ritesh";
        char target1 = 't';


        int ans = linearSearch1(nums,target);
        System.out.println(ans);
        System.out.println(search(name, target1));
        System.out.println(Arrays.toString(name.toCharArray()));
    }
}
