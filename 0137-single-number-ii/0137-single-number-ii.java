class Solution {
    public int singleNumber(int[] nums) {
       int one = 0 ;
       int two = 0;
       for(int num : nums){
        one = (num ^ one) & ~two;
        two = (num ^ two ) & ~one;
       }
       return one;
    }

}