class Solution {
    public String reverseWords(String s) {
        char[] chars = s.toCharArray();
        int st = 0;
        for(int i = 0;i<= chars.length;i++){
            if(i== chars.length || chars[i] == ' '){
                reverse(chars,st,i-1);
                st=i+1;
            }
        }
        return new String(chars);
    }
    void reverse(char []chars,int l,int r){
        while(l<r){
            char temp = chars[l];
            chars[l] = chars[r];
            chars[r] = temp;
            l++;
            r--;
        }
    }
}