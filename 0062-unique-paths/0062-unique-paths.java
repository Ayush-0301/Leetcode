class Solution {
    public int paths(int cr, int cc, int lr, int lc, int[][] memo) {
        if (cr == lr && cc == lc) return 1; 
        if (cr > lr || cc > lc) return 0; 
        
        // If we have already calculated the paths from this cell, return the stored result
        if (memo[cr][cc] != 0) {
            return memo[cr][cc];
        }
        
        int right = paths(cr, cc + 1, lr, lc, memo); 
        int down = paths(cr + 1, cc, lr, lc, memo); 
        
        // Save the result in the memo table before returning
        memo[cr][cc] = right + down;
        return memo[cr][cc]; 
    } 
    
    public int uniquePaths(int m, int n) {
        // Initialize a memoization table with the grid dimensions
        int[][] memo = new int[m][n];
        return paths(0, 0, m - 1, n - 1, memo); 
    } 
}