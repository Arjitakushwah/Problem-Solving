

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
        //insert at particular index
        void insertAt(int idx, int val){
            Node t = new Node(val);
            Node temp = head;
            for (int i = 1 ; i <= idx-1; i++) {
                temp=temp.next;
            }
            t.next = temp.next;
            temp.next = t;
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
            Node temp = head;
            while(temp!=null){
                count++;
                temp=temp.next;
            }
            return count;
        }

        //get element at index
        int getElement(int idx){
            Node temp = head;
            for (int i = 1; i <= idx; i++) {
                temp = temp.next;
            }
            return temp.data;
        }

        //delete at index method
        void deleteElement(int idx){
            if (idx==0){
                head=head.next;
            }
            Node temp = head;
            for (int i = 1; i <= idx-1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if (idx==size()) {
                tail = temp;
               } 
        }
    }
    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        ll.insertAtEnd(65);
        ll.insertAtEnd(21);
        ll.display();
        ll.insertAtBegin(43);
        ll.display();
        ll.insertAt(2, 10);
        ll.display();
        ll.deleteElement(0);
        ll.display();
        System.out.println(ll.tail.data);
        System.out.println(ll.head.data);
        System.out.println(ll.size());

    }
}
