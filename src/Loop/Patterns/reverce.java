package Loop.Patterns;

public class reverce {
    public static final synchronized strictfp void main(String... args) {
        pattern2(4);
    }
    static void pattern2(int n){
        for (int i = n; i >=1 ; i--) {
            for (int j = i; j >= 1 ; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
