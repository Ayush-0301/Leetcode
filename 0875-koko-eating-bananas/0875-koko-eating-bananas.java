class Solution {
    public int minEatingSpeed(int[] piles, int h) {
       int left = 1;
        int right = 0;
        for (int pile : piles) {
            right = Math.max(right, pile);
        }

        int result = right;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (canEatAll(piles, h, mid)) {
                result = mid;       
                right = mid - 1;
            } else {
                left = mid + 1;    
            }
        }

        return result;
    }

    private boolean canEatAll(int[] piles, int h, int k) {
        long totalHours = 0;
        for (int pile : piles) {
            totalHours += (pile + k - 1L) / k; // Ceiling division
        }
        return totalHours <= h;

        
    }
}