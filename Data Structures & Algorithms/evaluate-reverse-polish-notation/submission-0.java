class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> st = new ArrayDeque<>();

        for (int i = 0; i < tokens.length; i++) {
            String c = tokens[i];

            if (c.equals("+") || c.equals("-") || c.equals("*") || c.equals("/")) {
                int x = st.pop();   // right operand
                int y = st.pop();   // left operand

                if (c.equals("+"))      st.push(y + x);
                else if (c.equals("-")) st.push(y - x);
                else if (c.equals("*")) st.push(y * x);
                else                    st.push(y / x);
            } else {
                st.push(Integer.parseInt(c));
            }
        }
        return st.pop();
    }
}