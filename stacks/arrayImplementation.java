package stacks;

public class arrayImplementation {
    public static class Stack {
    private int[] arr = new int[10];
    private int index = 0; //act as a pointer
    //push
    void push(int x){
        if(isFull()){
            System.out.println("Stack is full!!");
            return;
        }
        arr[index] = x;
        index++;
    }

    //peek
    int peek(){
        if( index == 0){
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[index-1];
    }

    //pop
    int pop(){
        if (index==0) {
            System.out.println("Stack is Empty!!");
           return -1; 
        }
        int top = arr[index-1];
        arr[index-1]=0;
        index--;
        return top;
    }

    //display
    void display(){
        for (int i = 0; i <= index-1; i++) {
            System.out.print(arr[i]+" ");
        }System.out.println();
    }

    //size
    int size(){
        return index;
    }
     
    //isEmpty
    boolean isEmpty(){
        if(index==0){
            return true;
        }
        return false;
    }

    //is full
    boolean isFull(){
        if (index==arr.length) return true;
        return false;
    }
    }

    public static void main(String[] args) {
       Stack st = new Stack();
       st.push(4); 
       st.display();
       st.push(32);
       st.display();
       st.push(65);
       st.display();
       System.out.println(st.pop());
       System.out.println(st.peek());
    }
}
