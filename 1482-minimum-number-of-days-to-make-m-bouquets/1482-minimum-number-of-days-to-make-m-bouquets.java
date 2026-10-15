class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        // Edge case: if we need more flowers than total available, return -1
        if ((long) m * k > n) {
            return -1;
        }
        
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
        for (int day : bloomDay) {
            low = Math.min(low, day);
            high = Math.max(high, day);
        }
        
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (possible(bloomDay, mid, m, k)) {
                ans = mid;
                high = mid - 1; // Try to find a smaller valid day
            } else {
                low = mid + 1;  // Need more days
            }
        }
        
        return ans;
    }
    
    private boolean possible(int[] bloomDay, int day, int m, int k) {
        int bouquets = 0;
        int flowers = 0;
        
        for (int i = 0; i < bloomDay.length; i++) {
            if (bloomDay[i] <= day) {
                flowers++;
                if (flowers == k) {
                    bouquets++;
                    flowers = 0; // reset for the next bouquet
                }
            } else {
                flowers = 0; // consecutive chain is broken
            }
            
            if (bouquets >= m) {
                return true;
            }
        }
        
        return bouquets >= m;
    }
}