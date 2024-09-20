package Loop.Patterns;

public class Trangle {
    public static void main(String[] args) {
        pattern3(6);
    }
    static void pattern3(int n){
        for (int i=0; i<n; i++)
        {
        //inner loop work for space
            for (int j=n-i; j>1; j--)
            {
        //prints space between two stars
                System.out.print(" ");
            }
        //inner loop for columns
            for (int j=0; j<=i; j++ )
            {
        //prints star
                System.out.print("* ");
            }
        //throws the cursor in a new line after printing each line
            System.out.println();
        }

    }
}
