package stacks;

import java.util.Scanner;
import java.util.Stack;

public class Deletion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Stack<Integer> st = new Stack<>();
        st.push(32);
        st.push(43);
        st.push(65);
        st.push(98);

        System.out.println(st);
        //deletion at index n
        System.out.println("Enter the index");
        int n = sc.nextInt();

        Stack<Integer> rt = new Stack<>();
        while(st.size()>n+1){
            rt.push(st.pop());
        }
        st.pop();

        while(rt.size()>0){
            st.push(rt.pop());
        }

        System.out.println(st);
    }
}
