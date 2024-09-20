package Arrays;

import java.util.Scanner;

public class TwoDArray {
    static void printArray(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void reverce(int[] array){
        int i = 0; int j = array.length-1;
        while (i<j){
            int temp = array[i];
            array[i]=array[j];
            array[j]=temp;
            i++;
            j--;
        }
    }

    static void rotation(int[][] matrix, int n){
        findTranspose(matrix, n, n);
        for (int i = 0; i < n; i++) {
            reverce(matrix[i]);
        }
    }

    static int[][] findTranspose(int[][] matrix, int r, int c){
        int[][] ans = new int[r][c];
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                ans[i][j] = matrix[j][i];
            }
        }
        return ans;
    }

    static void multiplication(int[][] a, int r1, int c1, int[][] b, int r2, int c2){
        if(c1 != r2){
            System.out.println("Multiplication not possible");
            return;
        }
        int[][] mul = new int[r1][c2];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
//                    mul[][] = row of a * col of b
                    mul[i][j] += (a[i][k] *b[k][j]);
                }
            }
        }
        System.out.println("Multiplication of two matrix is : ");
        printArray(mul);
    }

    static void add(int[][] a, int r1, int c1, int[][] b, int r2, int c2 ){
        if(r1 != r1 || c1 != c2){
            System.out.println("Invlid Input - Addition not possible");
            return;
        }

        int[][] sum = new int[r1][c1];

        for (int i = 0; i < r1; i++) { // row number
            for (int j = 0; j < c1; j++) { // column number
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        System.out.println("Sum of matrix 1 and matrix 2");
        printArray(sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and columns of matrix 1");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int[][] a = new int[r1][c1];
        System.out.println("Enter"+ r1*c1 +"elements :");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter number of rows and columns of matrix 2");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int[][] b = new int[r2][c2];
        System.out.println("Enter"+ r2*c2 +"elements :");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix 1");
        printArray(a);
        System.out.println("Matrix 2");
        printArray(b);

        add(a, r1, c1, b, r2, c2);
        multiplication(a, r1, c1, b, r2, c2);
        System.out.println("Transpose of Matrix is : ");
        int[][] ans = findTranspose(a, r1, c1);
        printArray(ans);

        rotation(a,r1);
        System.out.println("Rotation of array is : ");
        printArray(a);
    }
}
