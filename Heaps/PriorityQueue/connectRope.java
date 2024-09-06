package Heaps.PriorityQueue;

import java.util.PriorityQueue;

public class connectRope {

    // ************ Problem Statement ***********//
    // connect N rope of the different  length , the task is to connect these ropes into one rope  with minimum cost value , such that  cost to connect two ropes  shoild be equal to  theis sum of the length 

    public static void main(String[] args) {
        int rope[]= {2,3,3,4,6};

        PriorityQueue<Integer>pq= new PriorityQueue<>();

        for(int i=0;i<rope.length;i++){
            pq.add(rope[i]);
        }

        int cost =0;

        while(pq.size()>1){
            int min=pq.remove(); // remove 1st  smallest element
            int min2=pq.remove(); // remove 1st  second element

            cost+= min+min2;
            pq.add(min+min2);


        }
        System.out.println(" Minimum cost to connect rope is "+cost);

        
    }


    
}
