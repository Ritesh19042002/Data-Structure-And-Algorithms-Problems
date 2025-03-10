package Top150Questions;

import java.util.Arrays;

public class RotateArray {
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;

        reverce(nums,0,n-1);
        reverce(nums,0,k-1);
        reverce(nums,k,n-1);
    }

    private static void reverce(int[] nums, int start, int end){
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;

        rotate(nums,k);

    }
}
