

public class basicll {

    //dispalying the linked list
    public static void display(Node head ){
        Node temp = head;
        while (temp!=null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    //display with recursion
    public static void displayR(Node head){
        if(head==null){
            return;
        }
        System.out.println(head.data);
        displayR(head.next);
    }
    //creating a node
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }

    //length of linked list
    public static int llLength(Node head){
        int count = 0;
        while(head!=null){
            count++ ;
            head=head.next;
        }
        return count;
    }
    public static void main(String[] args) {
        Node x =  new Node(5);
        Node y = new Node(4);
        Node z = new Node(50);
        x.next= y;
        y.next=z;
        System.out.println(x.next.next.data);

        Node temp = x;
for (int i = 0; i < 3; i++) {
    System.out.println(temp.data);
    temp = temp.next;
} 
    }
}
