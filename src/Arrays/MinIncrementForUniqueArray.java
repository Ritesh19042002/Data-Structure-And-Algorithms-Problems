package Arrays;
/*
945. Minimum Increment to Make Array Unique
Medium
Topics
Companies
You are given an integer array nums. In one move, you can pick an index i where 0 <= i < nums.length and increment nums[i] by 1.

Return the minimum number of moves to make every value in nums unique.

The test cases are generated so that the answer fits in a 32-bit integer.

Example 1:

Input: nums = [1,2,2]
Output: 1
Explanation: After 1 move, the array could be [1, 2, 3].
Example 2:

Input: nums = [3,2,1,2,1,7]
Output: 6
Explanation: After 6 moves, the array could be [3, 4, 1, 2, 5, 7].
It can be shown with 5 or less moves that it is impossible for the array to have all unique values.*/

import java.util.Scanner;
import java.util.Arrays;
public class MinIncrementForUniqueArray {
    public static int minIncrementForUnique(int[] nums){
        // Step 1: Sort the array
        Arrays.sort(nums);

        // Step 2: Initialize the number of moves
        int moves = 0;

        // Step 3: Traverse the array and ensure each element is unique
        for (int i = 1; i < nums.length; i++) {
            // If the current element is not greater than the previous element
            if (nums[i] <= nums[i - 1]) {
                // Increment the current element to be one more than the previous element
                int increment = nums[i - 1] - nums[i] + 1;
                nums[i] += increment;
                // Add the number of increments to the total moves
                moves += increment;
            }
        }

        return moves;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println(minIncrementForUnique(nums));
    }
}
