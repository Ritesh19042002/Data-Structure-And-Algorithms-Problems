package Arrays;

import java.util.List;
import java.util.Scanner;

class Solution {
    public int[] plusOne(int[] digits) {
        int a = digits.length;
        for(int i=a-1;i>=0;i--){
            digits[i]++;
            if(digits[i]<10){
                return digits;
            }
            digits[i]=0;
        }
        int[] result = new int[a+1];
        result[0] = 1;
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] digits = new int[a];
        for (int i = 0; i < digits.length; i++) {
            digits[i] = sc.nextInt();
        }
        Solution obj = new Solution();
        System.out.println(obj.plusOne(digits));
    }

}
