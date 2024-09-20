package flow_of_program;

public class PatternK {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            System.out.print(i);
            if (i < n)
                System.out.print("*");
        }
    }
}
