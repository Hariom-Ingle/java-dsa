package Queue;
import java.util.*;
public class stackUsingDeque {

    static class Stack{
        Deque <Integer> deque= new LinkedList<>();

        //  push operation
        public void push( int data){
            deque.addLast(data);

        }
        //  pop operation
        public int pop(){
            return deque.removeLast( );

        }
        //  peek operation
        public int peek( ){
            return deque.getLast( );

        }
    }
    public static void main(String[] args) {
        
        Stack s = new Stack(); // this is not a stack from the JCF  Stack its a object of class Stack witch is  mention above. 

        s.push(1);
        s.push(2);
        s.push(3);

        System.out.println("peek " +s.peek());
     
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());

    }
    
}
