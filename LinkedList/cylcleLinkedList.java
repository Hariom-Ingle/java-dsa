package LinkedList;

public class cylcleLinkedList {

    public static   class Node{
        int data;
        cylcleLinkedList.Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static cylcleLinkedList.Node head;
    public static cylcleLinkedList.Node tail;
    public static int size;

    //**************** Detect the cycle/loop in ll ******************
    public static boolean detectCycle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {  // Corrected condition
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    //**************** Detect the cycle/loop  and remove in ll ******************

    public static void removeCycle() {
        Node slow = head;
        Node fast = head;
        boolean exist = false;

        // Step 1: Detect Cycle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                exist = true;
                break;
            }
        }

        if (!exist) {
            return;
        }
        // Step 2: Find the start of the cycle
        slow = head;
        Node prev = null;

        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        // Step 3: Remove the cycle
        prev.next = null; // `prev` is the last node in the cycle, so set its next to null
    }



    public static void main(String[] args) {
        cylcleLinkedList ll = new cylcleLinkedList();

        head = new Node(1);
        Node temp = new Node(2);
        head.next = temp;
        temp.next = new Node(3);
        temp.next.next = new Node(4);
        temp.next.next.next = temp; // Creating a cycle
        System.out.println("Cycle Detected: " + detectCycle());
        removeCycle();
        System.out.println("Cycle Detected After Removal: " + detectCycle());

    }

}
