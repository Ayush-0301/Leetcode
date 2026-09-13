class Solution {
    public String reverseOnlyLetters(String s) {
        char[] ch = s.toCharArray();
        int l = 0;
        int r = ch.length-1;
        while(l<r){
            if(!Character.isLetter(ch[l])){
                l++;
            }
            else if (!Character.isLetter(ch[r])){
                r--;
            }
            else{
                char temp = ch[l];
                ch[l] = ch[r];
                ch[r] = temp;
                l++;
                r--;

            }
        }
        return new String(ch);
    }
}