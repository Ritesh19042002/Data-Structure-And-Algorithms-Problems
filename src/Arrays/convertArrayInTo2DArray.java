package Arrays;
import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class convertArrayInTo2DArray {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        int[] cnt = new int[n + 1];
        for (int x : nums) {
            ++cnt[x];
        }
        for (int x = 1; x <= n; ++x) {
            int v = cnt[x];
            for (int j = 0; j < v; ++j) {
                if (ans.size() <= j) {
                    ans.add(new ArrayList<>());
                }
                ans.get(j).add(x);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        convertArrayInTo2DArray solution = new convertArrayInTo2DArray();

        int[] nums1 = {1, 3, 4, 1, 2, 3, 1};
        List<List<Integer>> result1 = solution.findMatrix(nums1);
        System.out.println(result1);  // Output: [[1, 3, 4, 2], [1, 3], [1]]

        int[] nums2 = {1, 2, 3, 4};
        List<List<Integer>> result2 = solution.findMatrix(nums2);
        System.out.println(result2);  // Output: [[1, 2, 3, 4]]
    }
}
