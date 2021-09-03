package inf;

public class inf_q5 {
    /*
    Array + Math.max()
     */
    public static int maxProfit(int[] nums){
        if(nums.length==0) return 0;

        int max = 0;
        int sofaMin = nums[0];

        for (int i=0; i < nums.length; i++){
            if(nums[i] < sofaMin){
                sofaMin = nums[i];
            } else {
                max = Math.max(max, nums[i] - sofaMin);
            }
        }
        return max;
    }
}
