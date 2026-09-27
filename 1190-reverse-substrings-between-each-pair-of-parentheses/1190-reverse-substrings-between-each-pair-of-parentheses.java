class Solution {
    public String reverseParentheses(String s) {

        Stack<String> st = new Stack<>();
        String str = "";

        for (char ch : s.toCharArray()) {

            if (ch == '(') {
                st.push(str);
                str = "";
            }

            else if (ch == ')') {
                str = new StringBuilder(str).reverse().toString();
                str = st.pop() + str;
            }

            else {
                str += ch;
            }
        }

        return str;
    }
}