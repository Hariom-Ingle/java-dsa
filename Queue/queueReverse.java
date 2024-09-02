package Queue;
import java.util.*;
import java.util.Queue;
public class queueReverse {

    public static void QReverseUsingStack( Queue<Integer>q){

        Stack<Integer> s = new Stack<>();

        while (!q.isEmpty()) {
            s.push(q.remove());       
            
        }
        while (!s.isEmpty()) {
           q.add(s.pop());             
        }

    }

    public static void main(String[] args) {
        Queue<Integer> q= new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);

        QReverseUsingStack(q);


        // while (!q.isEmpty()) {
        //     System.out.println(q.peek());
        //     q.remove();
            
        // }
        System.out.println(q);

    }
    
}
