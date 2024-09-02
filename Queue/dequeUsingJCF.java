package Queue;
import java.util.*;

public class dequeUsingJCF {
    public static void main(String[] args) {
            Deque <Integer> deque= new LinkedList<>();


        deque.addFirst(10);
        deque.addFirst(20);
        deque.addLast(20);
        deque.addLast(50);

        System.out.println(deque);

    }
    
}
