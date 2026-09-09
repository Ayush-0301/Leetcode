class Solution {
    public long countCommas(long n) {
       long com = 0;
       long val = 1000;
       while(n>= val){
        com += (n- val +1);
        val *= 1000;

       }
       return com;
    }
}