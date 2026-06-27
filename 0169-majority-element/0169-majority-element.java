class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int ele = nums[0];
        for(int val : nums) {
            if(count == 0){
                 ele = val;
            }
            if(val == ele){
                count++;
            }
            else{
                count--;
            }
    }
        return ele;
    }
}