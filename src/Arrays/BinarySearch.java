package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size : ");
        int n = sc.nextInt();
        System.out.println("Enter array Elements :");
        int intArr[] = new int[n];
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = sc.nextInt();
        }
    //Sorting elements
        Arrays.sort(intArr);
        System.out.println("Enter array element you want to search :");
        int intKey = sc.nextInt();
        // printing searched elements
        System.out.println(intKey+" found at index "+Arrays.binarySearch(intArr,intKey));

        System.out.println("Enter target : ");
        int target = sc.nextInt();
        int ans = binarySearchElement(intArr, target);
        System.out.println(ans);

    }

    public static int binarySearchElement(int[] nums, int target){
        int start = 0;
        int end = nums.length - 1;

        while (start > end){
            int mid = start + (end - start) / 2;
            if (target < nums[mid]){
                end = mid - 1;
            } else if (target > nums[mid]) {
                end = mid + 1;
            }else {
                return mid;
            }

        }
        return -1;
    }

}
