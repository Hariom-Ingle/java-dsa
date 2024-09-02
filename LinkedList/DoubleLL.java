package LinkedList;

public class DoubleLL {

    public static class Node{
        int data ;
        Node prev;
        Node next;

        public Node( int data){
            this.data=data;
            this.prev=null;
            this.next=null;

        }
    }
    public  static Node head;
    public  static  Node tail;
    public  static int size;

    // ************ add method *************
    public static  void addFirst(int data){
        Node  newNode= new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;

        head=newNode;
        size++;
    }

    // ************ remove method *************

    public  static  int  removeFirst(){


         if(head==null){
             System.out.println(" Linked List ");
             return Integer.MIN_VALUE;


         }
        int val = head.data;
         if(size==1){
             val = head.data;
             head=tail=null;
             size--;
             return val;


         }
        head= head.next;
        head.prev=null;
        return val;

    }


    // PRINT FUNCTION
    public    void print(){
        Node temp = head;

        while (temp!= null){
            System.out.print(temp.data +"<->");
            temp=temp.next;
            size++;

        }
        System.out.print("null");  // for new line after printing all elements
        System.out.println();

    }
    public static void main(String[] args) {
        DoubleLL dll = new DoubleLL();

        // Adding elements to the doubly linked list
        dll.addFirst(10);
        dll.addFirst(20);
        dll.addFirst(30);

        // Printing the doubly linked list
        dll.print();  // Expected output: 30 20 10
        dll.removeFirst();
        dll.print();
    }
}
