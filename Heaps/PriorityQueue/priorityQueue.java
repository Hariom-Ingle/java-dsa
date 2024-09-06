package Heaps.PriorityQueue;
import java.util.*;

public class priorityQueue {

    static class Student implements Comparable<Student>{
        String name;
        int rank;

          Student (String name,int rank){
            this.name=name;
            this.rank=rank;
          }

         @Override 
         public int compareTo(Student s2){
            return this.rank-s2.rank;
         } 
    }
    public static void main(String[] args) {
        // PriorityQueue<Student> pq= new PriorityQueue<>();
        PriorityQueue<Student> pq= new PriorityQueue<>(Comparator.reverseOrder()); // this  will reverse the  order 

        pq.add(new Student("A", 4));
        pq.add(new Student("B", 10));
        pq.add(new Student("C", 2));
        pq.add(new Student("D", 5));

        while (!pq.isEmpty()) {
            System.out.println(pq.peek().name+"-->"+pq.peek().rank);
            pq.remove();
            
        }
        

    }
    
}
