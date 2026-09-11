class Solution {
     boolean[] value =  new boolean[26];
    public int maxDistinct(String s) {
        int als = 0;
        for(int c: s.toCharArray()){
            int index = c -'a';
            if(!value[index]){
                value[index] = true;
                als++;


            }
        }
        return als;
    }
}