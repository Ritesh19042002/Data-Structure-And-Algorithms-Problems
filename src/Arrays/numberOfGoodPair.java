package Arrays;

public class numberOfGoodPair {

    public static int numIdenticalPairs(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] == nums[j] && i < j){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] ans = {1,2,3,1,1,3};
        int a = numIdenticalPairs(ans);
        System.out.println(a);
    }
}
