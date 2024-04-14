package stacks;

import java.util.Stack;

public class balancedBrcket {
    public static boolean balanced(String str){
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch=='('){
                st.push(ch);
            }
            else{
                if (st.peek()=='(') {
                    st.pop();
                }
            }
        }
        if(st.size()!=0){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "()(())(";
        boolean ans =balanced(str);
        System.out.println(ans);
    }
}
