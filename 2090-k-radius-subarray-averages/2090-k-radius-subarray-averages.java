class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n = nums.length;
        int[] avgs = new int[n];
        
        // Initialize the result array with -1
        for (int i = 0; i < n; i++) {
            avgs[i] = -1;
        }
        
        // A window of radius k requires 2 * k + 1 elements
        int windowSize = 2 * k + 1;
        
        // If the array is smaller than the required window size, return all -1
        if (n < windowSize) {
            return avgs;
        }
        
        // Use long to prevent integer overflow during sum calculation
        long windowSum = 0;
        
        // Calculate the sum of the first window
        for (int i = 0; i < windowSize; i++) {
            windowSum += nums[i];
        }
        
        // The first valid center is at index k
        avgs[k] = (int) (windowSum / windowSize);
        
        // Slide the window across the rest of the array
        for (int i = k + 1; i <= n - k - 1; i++) {
            windowSum = windowSum - nums[i - k - 1] + nums[i + k];
            avgs[i] = (int) (windowSum / windowSize);
        }
        
        return avgs;
    }
}