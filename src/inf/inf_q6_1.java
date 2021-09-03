package inf;

public class inf_q6_1 {
    /*
    subArray + sum
     */
    public static int subarraySum(int[] nums, int k){
        int count = 0;

        for(int i = 0; i < nums.length; i++){
            int sum = 0;
            for (int j = i; j < nums.length; j++){
                sum = sum + nums[j];
                if(sum == k){
                    count++;
                }
            }
        }

        return count;
    }
}
