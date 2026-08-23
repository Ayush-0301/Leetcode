class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int tc = 0;
        for(int num : nums){
            if(num == 0 && digit == 0){
                tc++;
                continue;
            }
            while(num > 0){
                if(num % 10 == digit) tc++;
                num /= 10;
            }
        }
        return tc;
    }
}