package Arrays;

import java.util.Scanner;

public class largestMinimumDistance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] A = new int[N];

        for(int i = 0; i<N; i++){
            A[i] = sc.nextInt();
        }

//        int result = largestMinimumDistance(A, N, K);
//        System.out.println(result);
    }
}
