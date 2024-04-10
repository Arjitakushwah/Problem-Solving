package stacks;

public class linkedlistImplemetation {
    /**
     * Node
     */
    public static class Node {
     int  val;
     Node next;
     Node(int val){
        this.val = val;
     }
        
    }
    public static class Stack {
     Node head = null;
     int size =0;

     //push
     void push(int x){
        Node temp = new Node(x);
        temp.next=head;
        head=temp;
        size++;
        
     }

     //pop
     int pop(){
        if(head==null){
            System.out.println("Stack is empty!!");
        }
        int top = head.val;
        head=head.next;
        return top;
     }

     int peek(){
        if(head==null){
            System.out.println("Stack is empty!!");
        }
        return head.val;
     }

     //display reverse
     void displayrev(){
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.val+" ");
            temp=temp.next;
     }
     System.out.println();  
    }

    void displayRecursion(Node h){
        if(h==null) return;
        displayRecursion(h.next);
        System.out.print(h.val+" ");
        
    }

    ///display
    void display(){
        displayRecursion(head);
        System.out.println();
    }
     //size
     int size(){
        return size;
     }

     //isEmpty
     boolean isEmpty(){
        if(size==0) return true;
        return false;
     }
}
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(3);
        st.display();
        st.push(4);
        st.display();
        st.push(43);
        st.display();
        st.push(14);
        st.display();
        st.push(476);
        st.display();
        st.pop();
        st.display();
        
    }
}
