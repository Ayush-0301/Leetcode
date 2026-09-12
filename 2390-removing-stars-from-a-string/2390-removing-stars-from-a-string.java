class Solution {
    public String removeStars(String s) {
        Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch != '*'){
                st.push(ch);
            }
            else if (!st.isEmpty()){
                st.pop();
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char ch : st){
            sb.append(ch);
        }
        return sb.toString();
    }
}