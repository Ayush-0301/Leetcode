class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st = new Stack<>();
        Stack<Character> st1 = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch != '#') {
                st.push(ch);
            } else if (!st.isEmpty()) {
                st.pop();
            }
        }
        for (char ch : t.toCharArray()) {
            if (ch != '#') {
                st1.push(ch);
            } else if (!st1.isEmpty()) {
                st1.pop();
            }
        }
        return st.equals(st1);
    }
}