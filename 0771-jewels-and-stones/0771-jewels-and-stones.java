class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        boolean [] is = new boolean[128];
         for(char ch : jewels.toCharArray()){
            is[ch] = true;
        }
        int c = 0;
        for(char ch :stones.toCharArray()){
            if(is[ch]){
                c++;
            }
        }
        return c;
    }
}