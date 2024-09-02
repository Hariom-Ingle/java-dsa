package Queue;
import java.util.*;

public class Queue {
    private int[] arr;
    private int size;
    private int rear;
    private int front;
    private int count;

    // Constructor
    public Queue(int n) {
        arr = new int[n];
        size = n;
        rear = -1;
        front = 0;
        count = 0;
    }

    // Public methods to interact with the queue
    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == size;
    }

    public void add(int data) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        rear = (rear + 1) % size;
        arr[rear] = data;
        count++;
    }

    public int remove() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int data = arr[front];
        front = (front + 1) % size;
        count--;
        return data;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[front];
    }


    public static void main(String[] args) {
        Queue q =new Queue(5);

        q.add(0);
        q.add(1);
        q.add(2);

        while (!q.isEmpty()) {
       
            System.out.println(q.peek());

            q.remove();
            
        }

    }

}
