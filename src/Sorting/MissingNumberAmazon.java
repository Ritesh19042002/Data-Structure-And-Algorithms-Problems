package Sorting;

class MissingNumberAmazon {

    public static void main(String[] args) {
        int[] arr = {3,0,1};
        int n = missingNumber(arr);
        System.out.println(n + " is missing");

        int[] arr1 = {0,1};
        int o = missingNumber(arr1);
        System.out.println(o + " is missing");

        int[] arr2 = {9,6,4,2,3,5,7,0,1};
        int p = missingNumber(arr2);
        System.out.println(p + " is missing");
    }

    public static int missingNumber(int[] nums) {
        int i = 0;
        int n = 0;
        while (i < nums.length) {
            int correct = nums[i];
            if (nums[i] < nums.length && nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }
        // search for missing number
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index) {
                return index;
            }
        }
        return nums.length;
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}