package stacks;

import java.util.Stack;

public class stacks {

    public static void main(String[] args) {
        //int[] aa = new int[5]

        //STL(collection framework)
        Stack<Integer> st = new Stack<>();
        //push O(1)
        st.push(10);
        st.push(65);
        st.push(43);
        st.push(54);
        //peek O(1)
        System.out.println(st.peek());

        //pop O(1)
        st.pop();

        //size
        System.out.println(st.size());

        while(st.size()>1){
            st.pop();
        }
        //last element(inserted first)
        System.out.println(st.peek());

        //boolean check if stack is empty
        //size 0  
        st.isEmpty();
        
    }
}