package Queue;

public class queueUsingLL {

    // Node Class Initialization 
    static class Node {
        int data;
        Node next;


        Node (int data ){
            this.data= data;
            this.next=null; 
        }      
    }

    static class queue{
        static Node head = null;
        static Node  tail = null;

        //  Empty  Check 
        public  static boolean isEmpty(){
            return (head==null && tail==null);           
        }

        // Add to the  LL
        public static void add( int data ){

            Node newNode =  new Node(data);

            if (head==null){
                head=tail=newNode;
                return;   
            }
            tail.next= newNode;
            tail=newNode;        
        }
        // remove Node  
        public static int remove(){
            if(isEmpty()){
                System.out.println("The Linked list ");
                return -1;
            }
            int front = head.data;

            if( tail==head){
                tail=head=null;
            }else{
                head= head.next;
            }

            return front;
        }
        // peek the head
        public static  int peek(){
            if(isEmpty()){
                System.out.println("The Linked list ");
                return -1;
            }
            return head.data;
        }
    }


    public static void main(String[] args) {

      
        queue q =  new queue();

        q.add(1);
        q.add(2);
        q.add(3);

        // Print the elements to verify
        Node current = q.head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
        
    }
    
}
