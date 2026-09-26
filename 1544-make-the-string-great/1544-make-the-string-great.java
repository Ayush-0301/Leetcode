class Solution {
    public String makeGood(String s) {
        StringBuilder sb = new StringBuilder();
        for(char ch :  s.toCharArray()){
            if(sb.length() > 0){
                int last = sb.charAt(sb.length() - 1);
                if(last  + 32 == ch || last - 32 == ch){
                    sb.deleteCharAt(sb.length() - 1);
                    continue;
                }
            }
            sb.append(ch);

        }
        return sb.toString();
    }
} 