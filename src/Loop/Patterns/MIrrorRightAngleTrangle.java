package Loop.Patterns;

public class MIrrorRightAngleTrangle {

    static void pattern(int row){
        for (int i = 1; i < row; i++) {
            for (int j = 0; j < row - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        pattern(5);
    }
}
