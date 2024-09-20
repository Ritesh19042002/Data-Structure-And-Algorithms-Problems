package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class mergeArray {
    public void merge(int[] num1, int m, int[] num2, int n) {
        for(int j = 0, i=m; j<n; j++){
            num1[i]=num2[j];
            i++;
        }
        Arrays.sort(num1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] num1 = new int[5];
        for (int i = 0; i < 6; i++) {
            num1[i]=sc.nextInt();
        }
        int m = sc.nextInt();
        int[] num2 = {2,5,6};
        for (int i = 0; i <= 3; i++) {
            num2[i]=sc.nextInt();
        }
        int n = sc.nextInt();
    }
}
