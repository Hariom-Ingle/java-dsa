// package Queue;

// import java.util.*;;

// public class usingTwoStacks {

//     static class queue {
//         static Stack<Integer> s1 = new Stack<>();
//         static Stack<Integer> s2 = new Stack<>();

//         public boolean isEmpty() {

//             return s1.isEmpty();

//         }

//         // add ---> o(n)
//         public void add(int data) {
//             if (s1.isEmpty()) {
//                 s1.push(data);
//                 return;
//             } else {
//                 while (!s1.isEmpty()) {

//                     s2.push(s1.pop());
//                 }
//             }

//             s1.add(data);
//             while (!s2.isEmpty()) {
//                 s1.push(s2.pop());
//             }
//         }

//         // remove ---> o(1)
//         public static void remove() {
//             if (s1.isEmpty()) {
//                 System.out.println("Stack is empty ");
//             }
//             s1.pop();
//         }

//         // peek ---> o(1)
//         public static void peek() {
//             if (s1.isEmpty()) {
//                 System.out.println("Stack is empty ");
//             }
//             s1.peek();
//         }

//     }

//     public static void main(String[] args) {
//         queue q =  new queue();

//         q.add(1);
//         q.add(2);
//         q.add(3);

//         // Print the elements to verify
//         while (!q.isEmpty) {
//             System.out.println( q.peek());
//              q.remove;
//         }
//     }

// }


package Queue;

import java.util.Stack;

public class usingTwoStacks {

    static class QueueUsingStacks {
        private Stack<Integer> s1 = new Stack<>();
        private Stack<Integer> s2 = new Stack<>();

        // Check if the queue is empty
        public boolean isEmpty() {
            return s1.isEmpty();
        }

        // Add an element to the queue
        public void add(int data) {
            // Move all elements from s1 to s2
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }

            // Push the new element onto s1
            s1.push(data);

            // Move all elements back from s2 to s1
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }

        // Remove an element from the queue
        public Integer remove() {
            if (s1.isEmpty()) {
                System.out.println("Queue is empty");
                return null; // Return null or handle empty case
            }
            return s1.pop();
        }

        // Peek at the front element
        public Integer peek() {
            if (s1.isEmpty()) {
                System.out.println("Queue is empty");
                return null; // Return null or handle empty case
            }
            return s1.peek();
        }
    }

    public static void main(String[] args) {
        QueueUsingStacks q = new QueueUsingStacks();

        q.add(1);
        q.add(2);
        q.add(3);

        // Print the elements to verify
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
