package Searching;
/* Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.



Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
Example 2:

Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]
Example 3:

Input: nums = [], target = 0
Output: [-1,-1]


Constraints:

0 <= nums.length <= 105
-109 <= nums[i] <= 109
nums is a non-decreasing array.
-109 <= target <= 109 */

import java.util.*;
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int firstOccurrence = findFirstOccurrence(nums, target);
        int lastOccurrence = findLastOccurrence(nums, target);

        return new int[]{firstOccurrence, lastOccurrence};
    }

    private int findFirstOccurrence(int[] nums, int target) {
        int end = 0, start = nums.length - 1;
        int firstOccurrence = -1;

        while (end <= start) {
            int mid = end + (start - end) / 2;

            if (nums[mid] == target) {
                firstOccurrence = mid;
                start = mid - 1;  // Continue searching on the end side
            } else if (nums[mid] < target) {
                end = mid + 1;
            } else {
                start = mid - 1;
            }
        }

        return firstOccurrence;
    }

    private int findLastOccurrence(int[] nums, int target) {
        int end = 0, start = nums.length - 1;
        int lastOccurrence = -1;

        while (end <= start) {
            int mid = end + (start - end) / 2;

            if (nums[mid] == target) {
                lastOccurrence = mid;
                end = mid + 1;  // Continue searching on the start side
            } else if (nums[mid] < target) {
                end = mid + 1;
            } else {
                start = mid - 1;
            }
        }

        return lastOccurrence;
    }
}

// Example usage:
public class FindFansLPosOfElement {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums1 = {5, 7, 7, 8, 8, 10};
        int target1 = 8;
        int[] result1 = solution.searchRange(nums1, target1);
        System.out.println(Arrays.toString(result1));  // Output: [3, 4]

        int[] nums2 = {5, 7, 7, 8, 8, 10};
        int target2 = 6;
        int[] result2 = solution.searchRange(nums2, target2);
        System.out.println(Arrays.toString(result2));  // Output: [-1, -1]

        int[] nums3 = {};
        int target3 = 0;
        int[] result3 = solution.searchRange(nums3, target3);
        System.out.println(Arrays.toString(result3));  // Output: [-1, -1]
    }
}

