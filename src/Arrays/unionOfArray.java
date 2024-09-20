package Arrays;

import java.util.Scanner;

public class unionOfArray {
    public static void union(int[] a,int[] b,int m,int n){
        for (int i = 0; i < m; i++) {
            boolean check = false;
            for (int j = 0; j < n; j++) {
                if (b[i]==a[i]){
                    check = true;
                    break;
                }
            }
            if(!check){
                System.out.println(b[i]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
            a[i]= sc.nextInt();
        }

        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }

        union(a,b,m,n);
    }
}
