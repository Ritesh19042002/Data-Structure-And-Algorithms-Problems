import java.util.Scanner;

public class UncommonColumns {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the matrices
        int n = scanner.nextInt();

        // Input the matrices
        int[][] matrix1 = new int[n][n];
        int[][] matrix2 = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }

        // Find the number of uncommon columns
        int uncommonColumns = findUncommonColumns(matrix1, matrix2, n);

        // Print the result
        System.out.println(uncommonColumns);

        scanner.close();
    }

    private static int findUncommonColumns(int[][] matrix1, int[][] matrix2, int n) {
        int uncommonColumns = 0;

        // Check each column
        for (int j = 0; j < n; j++) {
            boolean columnMatch = true;

            // Check each element in the column
            for (int i = 0; i < n; i++) {
                if (matrix1[i][j] == matrix2[i][j]) {
                    // If the corresponding elements are equal, continue checking the next element
                    continue;
                } else {
                    // If the corresponding elements are not equal, the column does not match
                    columnMatch = false;
                    break;
                }
            }

            // If the column does not match, increment the count of uncommon columns
            if (!columnMatch) {
                uncommonColumns++;
            }
        }

        return uncommonColumns;
    }
}
