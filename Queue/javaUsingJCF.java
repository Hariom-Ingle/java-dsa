package Queue;

import java.util.Queue;
import java.util.LinkedList;


public class javaUsingJCF {
    public static void main(String[] args) {
        // Create a Queue of Integers using LinkedList
        Queue<Integer> q = new LinkedList<>();

        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) { // Call isEmpty() on the queue instance
            System.out.println(q.peek()); // Call peek() on the queue instance
            q.remove(); // Call remove() on the queue instance
        }
    }
}
