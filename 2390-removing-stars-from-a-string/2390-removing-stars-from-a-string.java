class Solution {
    public String removeStars(String s) {
        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(sb.length()>0 && ch == '*'){
                sb.deleteCharAt(sb.length()-1);
            }
            else if(ch != '*'){
                sb.append(ch);
            }
        }
        return sb.toString();

    }
}