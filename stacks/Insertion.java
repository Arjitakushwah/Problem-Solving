package stacks;

import java.util.Scanner;
import java.util.Stack;

public class Insertion {

    public static void displayRecursive(Stack<Integer> st){
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Stack<Integer> st = new Stack<>();
        st.push(32);
        st.push(43);
        st.push(65);
        st.push(98);

        System.out.println(st);
        //insertion at index n
        System.out.println("Enter the index");
        int n = sc.nextInt();
        System.out.println("Enter the element");
        int x = sc.nextInt();

        Stack<Integer> rt = new Stack<>();
        while(st.size()>n){
            rt.push(st.pop());
        }
        st.push(x);
        while (rt.size()>0) {
            st.push(rt.pop());
        }

        System.out.println(st);

    }
}
