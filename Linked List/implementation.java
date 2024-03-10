

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
        //insert at beginning
        void insertAtBegin(int val){
            Node temp= new Node(val);
            if(head==null){
                head=temp;
                tail=temp;
            }
            else{
                temp.next=head;
                head=temp;
            }
            
        }
        //display the linked list
        void display(){
            Node temp= head;
            while (temp!=null) {
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
        }

        //length of linked list
        int size(){
            int count=0;
            Node temp =head;
            while(temp!=null){
                count++;
                temp=temp.next;
            }
            return count;
        }
    }
    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        ll.insertAtEnd(65);
        ll.insertAtEnd(21);
        ll.display();
        ll.insertAtBegin(43);
        ll.display();

    }
}
