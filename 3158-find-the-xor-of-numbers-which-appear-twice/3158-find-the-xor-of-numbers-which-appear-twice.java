class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        int[] count = new int[51]; 
        
        for (int num : nums) {
            count[num]++;
        }
        
        int xorSum = 0;
        // XOR numbers that appear twice
        for (int i = 1; i <= 50; i++) {
            if (count[i] == 2) {
                xorSum ^= i;
            }
        }
        
        return xorSum;
    }
}