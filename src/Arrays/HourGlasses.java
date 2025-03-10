//You are given 6*6 a  2D array. An hourglass in an array is a portion shaped like this:
//
//        a b c
//        d
//        e f g
//        For example, if we create an hourglass using the number 1 within an array full of zeros, it may look like this:
//
//        1 1 1 0 0 0
//        0 1 0 0 0 0
//        1 1 1 0 0 0
//        0 0 0 0 0 0
//        0 0 0 0 0 0
//        0 0 0 0 0 0
//        Actually, there are many hourglasses in the array above. The three leftmost hourglasses are the following:
//
//        1 1 1     1 1 0     1 0 0
//        1         0         0
//        1 1 1     1 1 0     1 0 0
//        The sum of an hourglass is the sum of all the numbers within it. The sum for the hourglasses above are 7, 4, and 2, respectively.
//
//        In this problem you have to print the largest sum among all the hourglasses in the array.
//
//        Input Format
//
//        There will be exactly 6  lines, each containing 6 integers seperated by spaces. Each integer will be between -9 and 9 inclusive.
//
//        Output Format
//
//        Print the answer to this problem on a single line.
//
//        Sample Input
//
//        1 1 1 0 0 0
//        0 1 0 0 0 0
//        1 1 1 0 0 0
//        0 0 2 4 4 0
//        0 0 0 2 0 0
//        0 0 1 2 4 0
//        Sample Output
//
//        19
//        Explanation
//
//        The hourglass which has the largest sum is:
//
//        2 4 4
//        2
//        1 2 4

package Arrays;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class HourGlasses {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }

            arr.add(arrRowItems);
        }

        int maxSum = findMaxHourglassSum(arr);

        // Printing the maximum sum
        System.out.println(maxSum);

        bufferedReader.close();
    }

    private static int findMaxHourglassSum(List<List<Integer>> arr) {
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                int sum = calculateHourglassSum(arr, i, j);
                maxSum = Math.max(maxSum, sum);
            }
        }

        return maxSum;
    }

    // Function to calculate the sum of an hourglass
    private static int calculateHourglassSum(List<List<Integer>> arr, int row, int col) {
        int sum = arr.get(row).get(col) + arr.get(row).get(col + 1) + arr.get(row).get(col + 2)
                + arr.get(row + 1).get(col + 1) +
                arr.get(row + 2).get(col) + arr.get(row + 2).get(col + 1) + arr.get(row + 2).get(col + 2);
        return sum;
    }
}

