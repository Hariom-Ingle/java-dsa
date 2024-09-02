package LinkedList;

public class Linkedlistoperations {

    // ******************* Node class representing each element in the linked list *******************
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // ******************* Add a new node at the beginning of the linked list *******************
    public void AddFirst(int data) {
        Node newnode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }

    // ******************* Add a new node at the end of the linked list *******************
    public void addlast(int data) {
        Node newnode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newnode;
        } else {
            tail.next = newnode;
            tail = newnode;
        }
    }

    // ******************* Add a new node at a specific index in the linked list *******************
    public void addmidl(int data, int index) {
        if (index == 0) {
            AddFirst(data);
            return;
        }
        Node newnode = new Node(data);
        Node temp = head;
        size++;
        int i = 0;
        while (i < index - 1) {
            temp = temp.next;
            i++;
        }
        newnode.next = temp.next;
        temp.next = newnode;
    }

    // ******************* Remove the first node in the linked list *******************
    public int removefirst() {
        if (size == 0) {
            System.out.println("Linked list is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    // ******************* Remove the last node in the linked list *******************
    public int removeLast() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    // ******************* Search for a value in the linked list iteratively *******************
    public int itrSearch(int key) {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    // ******************* Search for a value in the linked list recursively *******************

    public  int recsearch(int key){
        return helper(head,key);
    }
    public   int helper(Node head,int key){

        if(head==null){
            return -1;

        }
        if(head.data==key){
            return 0;
        }
        int idx=helper(head.next ,key);
        if(idx==1){
            return -1;
        }
        return idx+1;
    }

    // ******************* Reverse  all elements in the linked list *******************
    public void reverse(){
        Node prev=null;
        Node curr= tail=head;

        Node next;
        while(curr!=null){
            next= curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;

        }
        head=prev;
    }

    // ******************* Find the middle node of the linked list *******************
    public Node findmid(Node head) {
        // Initialize slow and fast pointers
        Node slow = head;
        Node fast = head;

        // Traverse the list with fast moving twice as fast as slow
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // When fast reaches the end, slow will be at the middle
        return slow;
    }
    public boolean checkpalindrome() {
        if (head == null || head.next == null) {
            return true;
        }

        // Step 1: Find the middle of the linked list
        Node mid = findmid(head);

        // Step 2: Reverse the second half of the linked list
        Node prev = null;
        Node curr = mid.next; // Start reversing from mid.next to reverse only the second half
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Step 3: Compare the first half and the reversed second half
        Node right = prev; // The start of the reversed second half
        Node left = head;

        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }

        // If all elements matched, it's a palindrome
        return true;
    }



    // ******************* Print all elements in the linked list *******************
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
        System.out.println(size);
    }

    public static void main(String[] args) {
        Linkedlistoperations ll = new Linkedlistoperations();

        // Add elements to the list
        ll.AddFirst(10);
        ll.AddFirst(20);
        ll.AddFirst(30);
        ll.AddFirst(50);
        ll.addlast(60);
        ll.addmidl(35, 3);

        ll.print();
//        System.out.println("Key found at index: " + ll.itrSearch(60));

//        System.out.println("Key found at index: " + ll.recsearch(60));
        ll.reverse();
        ll.print();

        System.out.println( "Check palindrome is "+ll.checkpalindrome());


    }
}
