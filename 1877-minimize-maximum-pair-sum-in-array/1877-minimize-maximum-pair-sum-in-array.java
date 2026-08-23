class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        int msum = Integer.MIN_VALUE;
        int n = nums.length;
        for(int i = 0;i<n/2;i++){
            sum = nums[i] + nums[n-i-1];
            if(msum < sum){
                msum = sum;
            }

        }
        return msum;
    }
}