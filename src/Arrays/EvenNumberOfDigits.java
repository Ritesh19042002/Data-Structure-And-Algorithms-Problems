package Arrays;

public class EvenNumberOfDigits {

        public static int findNumbers(int[] nums) {
            int count = 0;
            for(int num : nums){
                if(even(num)){
                    count++;
                }
            }
            return count;
        }
        static boolean even(int num){
            int count = 0;
            int numberOfDigits = digits(num);

            if(numberOfDigits % 2 == 0){
                return true;
            }
            return false;
        }

        static int digits(int num){
            if(num < -1){
                return num = num * -1;
            }
            if(num == 0){
                return 0;
            }
            int count = 0;
            while(num > 0){
                count++;
                num = num/10;
            }
            return count;
        }

    public static void main(String[] args) {
        int[] nums = {12,345,3,6,7896};
        System.out.println(findNumbers(nums));
    }

}
