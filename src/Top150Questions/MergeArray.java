package Top150Questions;

import java.util.Arrays;

public class MergeArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n){
        // Initialize pointers for nums1 and nums2
        int ptr1 = m - 1;
        int ptr2 = n - 1;

        // Initialize the pointer for the merged array (nums1)
        int ptrMerged = m + n - 1;

        // Merge nums1 and nums2 in non-decreasing order
        while (ptr1 >= 0 && ptr2 >= 0) {
            if (nums1[ptr1] >= nums2[ptr2]) {
                nums1[ptrMerged] = nums1[ptr1];
                ptr1--;
            } else {
                nums1[ptrMerged] = nums2[ptr2];
                ptr2--;
            }
            ptrMerged--;
        }

        // If there are remaining elements in nums2, copy them to nums1
        while (ptr2 >= 0) {
            nums1[ptrMerged] = nums2[ptr2];
            ptr2--;
            ptrMerged--;
        }
    }
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;

        merge(nums1,m,nums2,n);

        for (int num : nums1){
            System.out.print(num + " ");
        }

    }
}
