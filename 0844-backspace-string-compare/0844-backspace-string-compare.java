class Solution {
    public boolean backspaceCompare(String s, String t) {
        return f(s).equals(f(t));
    }
    String f(String s){
        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(sb.length()> 0 && ch == '#')
                sb.deleteCharAt(sb.length()-1);
            
            else if(ch != '#')
                sb.append(ch);
        }
            return sb.toString();
        
        
    }

}