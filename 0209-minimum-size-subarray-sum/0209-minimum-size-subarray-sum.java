class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l = 0;
        int cSum = 0;
        int minL = Integer.MAX_VALUE;

        for(int i = 0 ;i < nums.length;i++){
            cSum += nums[i];

            while(cSum >= target){
                minL = Math.min(minL,i-l+1);
                cSum -= nums[l];
                l++;
            }
        }
        return minL== Integer.MAX_VALUE ?0:minL;
    }
}