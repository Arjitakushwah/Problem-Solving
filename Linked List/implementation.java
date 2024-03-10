

public class implementation {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static class Linkedlist{
        Node head = null;
        Node tail = null;
        void insertAtEnd(int val){
            Node temp = new Node(val);
            //for empty list
            if(head==null){
                head=temp;
                
            }
            //list not empty
            else{
            tail.next = temp;
            }
            tail=temp;
        }
        //display the linked list
        void display(){
            Node temp= head;
            while (temp!=null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }
    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        ll.insertAtEnd(65);

    }
}
