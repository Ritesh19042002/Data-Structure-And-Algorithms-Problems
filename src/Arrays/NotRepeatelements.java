package Arrays;

public class NotRepeatelements {
    public static void main(String[] args) {
        int[] arr = new int[]{1,1,2,3,3,4,4,8,8};
        int result = 0;

        for (int num: arr) {
            result ^= num;
        }

        System.out.println(result);
    }
}
