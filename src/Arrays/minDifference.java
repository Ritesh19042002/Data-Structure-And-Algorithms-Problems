package Arrays;
import java.util.*;
public class minDifference {

    public static int minimizeHeightDifference(int[] arr, int N, int K) {
        // Calculate the initial difference between tallest and shortest towers
        int initialDiff = arr[N - 1] - arr[0];

        // Calculate the potential new shortest and tallest towers
        int newShortest = arr[0] + K;
        int newTallest = arr[N - 1] - K;

        // Ensure newShortest is not greater than newTallest
        if (newShortest > newTallest) {
            int temp = newShortest;
            newShortest = newTallest;
            newTallest = temp;
        }

        // Update the heights of the towers in the array
        for (int i = 1; i < N - 1; i++) {
            int currentTower = arr[i];

            // If increasing the height doesn't exceed newTallest, increase it
            if (currentTower + K <= newTallest) {
                arr[i] += K;
            }
            // If decreasing the height doesn't go below newShortest, decrease it
            else if (currentTower - K >= newShortest) {
                arr[i] -= K;
            }
            // If both options are invalid, choose the one that minimizes the difference
            else {
                if (newTallest - currentTower <= currentTower - newShortest) {
                    arr[i] += K;
                } else {
                    arr[i] -= K;
                }
            }
        }

        // Recalculate the new difference
        int newDiff = arr[N - 1] - arr[0];

        return Math.min(initialDiff, newDiff);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N :");
        int N = sc.nextInt();
        int[] arr = new int[N];
        System.out.println("Enter array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter K");
        int K = sc.nextInt();
        Arrays.sort(arr); // Sort the array to simplify the calculation
        int result = minimizeHeightDifference(arr, N, K);
        System.out.println(result); // Output: 5
    }
}
