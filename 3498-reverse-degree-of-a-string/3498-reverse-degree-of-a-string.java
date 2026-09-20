class Solution {
    public int reverseDegree(String s) {
        int t = 0;
        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            int r = 'z' - c+1;
            int index = i+1;
            t += r * index;
        }
        return t;
    }
}