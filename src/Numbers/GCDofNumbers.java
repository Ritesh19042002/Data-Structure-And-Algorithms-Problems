package Numbers;

import java.util.Scanner;

public class GCDofNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int ans = gcdNumber(n,m);
        System.out.println("The GCD of  a number is: "+ ans);

        int gcd = 0;
        for (int i = Math.min(n,m); i >= 1 ; i--) {
            if (n % i == 0 && m % i == 0){
                gcd = i;
                break;
            }
        }
        System.out.println(gcd);
    }
    // Euclidean Algorithm
    public static int gcdNumber(int n, int m){
        while (n > 0 && m > 0){
            if (n > m) n = n % m;
            else m = m % n;
        }
        if (n == 0) return m;
        return n;
    }
}
