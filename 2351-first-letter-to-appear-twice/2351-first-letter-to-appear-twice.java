class Solution {
    public char repeatedCharacter(String s) {
        boolean [] freq = new boolean[26];
        for(int i = 0;i<s.length();i++){
        
        if(freq[s.charAt(i)-'a']){
         return s.charAt(i);}
        
        freq[s.charAt(i)-'a'] = true;
        }
        return ' ';
    }
}