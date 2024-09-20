package Arrays;

public class SubArraySum {
    static int subArray(int[] arr, int k){
        int wsum = 0;
        int msum = Integer.MIN_VALUE;
        for (int i = 0; i < k; i++) {
            wsum += arr[i];
        }
        for (int j = k; j < arr.length; j++) {
            wsum = wsum - arr[j-k] + arr[j];
            msum = Math.max(msum, wsum);
        }
        return msum;
    }
    public static void main(String[] args) {
        int[] arr = {2,9,31,-4,21,7};
        int k = 3;

        System.out.println("Maximum subarray sum = "+ subArray(arr,k));
    }
}
