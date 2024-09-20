package Loop.Patterns;

import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int gap = n - 1, stars = 1;
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < gap; j++) {
                System.out.print(' ');
            }
            for (int j = gap; j < gap + stars; j++) {
                System.out.print('*');
            }

            // End the current row of the pattern.
            System.out.println();

            gap--;
            stars += 2;
        }
    }
}