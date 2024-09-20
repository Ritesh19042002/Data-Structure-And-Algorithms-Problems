package Recursion;

public class RecursionFiniteTimes {
    static int count = 0;
    static void p(){
        count++;
        if(count <= 5){
            System.out.println("Hello World " + count);
            p();
        }
    }

    public static void main(String[] args) {
        p();
    }
}
