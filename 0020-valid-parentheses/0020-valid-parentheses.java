class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '(' || ch == '[' || ch == '{') st.push(ch);
            else{ //closing bracket
                if (st.size()==0) return false;
                char top = st.peek();
                if(same(top,ch)) st.pop();
                else return false;
            }
        }
        return (st.size() == 0);
    }

    private static boolean same(char a, char b ){
        if(a == '(' && b == ')') return true;
        if(a == '[' && b == ']') return true;
        if(a =='{' && b == '}') return true;
        return false;

    }
    
}