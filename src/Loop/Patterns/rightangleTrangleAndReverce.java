package Loop.Patterns;

public class rightangleTrangleAndReverce {
    public static void main(String[] args) {
        pattren1(5);
    }
    static void pattren1(int n){
        for (int row = 0; row < 2 * n; row++) {
            int totalcolsInRow = row > n ? 2 * n - row : row;
            for (int col = 0; col < totalcolsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
