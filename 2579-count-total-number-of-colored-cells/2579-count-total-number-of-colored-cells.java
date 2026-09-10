class Solution {
    public long coloredCells(int n) {
        long num = (long) n;
        return (num * num ) + ((num-1)*(num-1));
    }
}