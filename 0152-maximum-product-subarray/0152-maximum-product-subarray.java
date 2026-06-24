class Solution {
    public int maxProduct(int[] nums) {
        int pr = 1;
        int mpr = nums[0];
        for(int i =0;i<nums.length;i++){
            
            pr *= nums[i];
            if(pr> mpr){
            mpr = pr;
            }
           if(pr==0){
            pr = 1;
           }
        }
        pr = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            pr *= nums[i];
            if (pr > mpr) {
                mpr = pr;
            }
            if (pr == 0) {
                pr = 1;
            }
        }
        return mpr;
    }
}