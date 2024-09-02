package Queue;

import java.util.*;

public class queueUsingDeque {

    static class Queue {
        Deque<Integer> deque = new LinkedList<>();

        // Add function
        public void add(int data) {
            deque.addLast(data);

        }

        // remove function
        public int remove() {
            return deque.removeFirst();

        }

        public int peek() {
            return deque.getFirst();
        }

    }

    public static void main(String[] args) {
        Queue q = new Queue();

        q.add(1);
        q.add(2);
        q.add(3);

        System.out.println("peek" + q.peek());
        System.out.println(+ q.remove());
        System.out.println(+ q.remove());
        System.out.println(+ q.remove());
    }

}
