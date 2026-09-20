class Solution {
    public String kthLargestNumber(String[] nums, int k) {
   Arrays.sort(nums, (a, b) -> {
            // 1. Compare by length
            if (a.length() != b.length()) {
                return Integer.compare(a.length(), b.length());
            }
            // 2. If lengths are equal, compare lexicographically
            return a.compareTo(b);
        });
        
     
        return nums[nums.length - k];
    }
}