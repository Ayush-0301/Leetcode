class Solution {
    public String reverseStr(String s, int k) {
        char []ch = s.toCharArray();
      
        for(int i = 0 ;i<ch.length;i += 2*k){
            int st = i; //2k wale element wala point
            int end = Math.min(i+k-1,ch.length-1); // define the limit
            reverse(ch,st,end);
           
        }
        return new String(ch);
    }
    void reverse(char[] ch ,int l,int r){
        while(l<r){
            char temp = ch[l];
            ch[l] = ch[r];
            ch[r] = temp;
            l++;
            r--;

        }
    }
}