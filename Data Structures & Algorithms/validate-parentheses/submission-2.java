class Solution {
    public boolean isValid(String s) {

       Stack<Character> st = new Stack<>();

       int n = s.length();
       st.push(s.charAt(0));
       for(int i = 1 ; i< n ; i++){
        if(!st.isEmpty() && s.charAt(i)==')' && st.peek()=='('){
            st.pop();
        } else if(!st.isEmpty() && s.charAt(i)=='}' && st.peek()=='{'){
            st.pop();
       }else if(!st.isEmpty() && s.charAt(i)==']' && st.peek()=='['){
            st.pop();
       }else{
        st.push(s.charAt(i));
       }
       }
        return st.isEmpty();

    }
}
