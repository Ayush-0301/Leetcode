import java.util.Stack;

class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;

        int[] nse = new int[n];
        Stack<Integer> st = new Stack<>();

        // Next Smaller Element
        nse[n - 1] = n;
        st.push(n - 1);

        for (int i = n - 2; i >= 0; i--) {
            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }

            if (st.isEmpty())
                nse[i] = n;
            else
                nse[i] = st.peek();

            st.push(i);
        }

        st.clear();

        // Previous Smaller Element
        int[] pse = new int[n];
        pse[0] = -1;
        st.push(0);

        for (int i = 1; i < n; i++) {
            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }

            if (st.isEmpty())
                pse[i] = -1;
            else
                pse[i] = st.peek();

            st.push(i);
        }

        int max = 0;

        for (int i = 0; i < n; i++) {
            int width = nse[i] - pse[i] - 1;
            int area = heights[i] * width;
            max = Math.max(max, area);
        }

        return max;
    }
}