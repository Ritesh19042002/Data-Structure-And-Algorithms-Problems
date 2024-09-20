package Arrays;

public class FirstArray {
    static {
        System.out.println("Static block");
    }

    public static void main(String[] args) {

        String[] arr = {"P","Q","R"};
        int[] arr1 = {1};
        args = arr;
        System.out.println(arr1);
        for (String s:args) {
            System.out.println(s);
        }
    }
}

