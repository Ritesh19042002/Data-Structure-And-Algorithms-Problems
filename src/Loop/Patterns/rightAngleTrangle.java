package Loop.Patterns;

public class rightAngleTrangle {
    public static void main(String[] args) {
        pattern1(4);
        pattern2(4);
        pattern3(5);
    }
    static void pattern1(int n){
        for (int i = 1; i <= n; i++) {
            // for every row , run the col
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // when row is printed, we need to add a new line
            System.out.println();
        }
    }
    static void pattern2(int m) {
        for (int i = 1; i < m; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    static void pattern3(int row){
        for (int i = 0; i <= row; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < 2*(row-i); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

