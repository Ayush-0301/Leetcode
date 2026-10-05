class Solution {
    public boolean isPowerOfFour(int n) {
        return (n > 0 && isPowerofTwo(n) && isSquare(n));
    }
    boolean isPowerofTwo(int n) {
        return ((n & (n - 1)) == 0);
    }

    boolean isSquare(int n) {
        int root = (int) Math.sqrt(n);
        return (root * root == n);
}
}