package Hashing;

import java.util.HashSet;
import java.util.Iterator;

public class Q3_countDistinctElement {

    public static void main(String[] args) {

        HashSet <Integer>set = new HashSet<>();

        int nums[] = {2,3,6,6,3,3,4,2,6} ;

    
         for( int i = 0; i<nums.length;i++){
            set.add(nums[i]);
         }
        
        //  Iterator it= set.iterator();
        //  while (it.hasNext()) {
        //     System.out.println(it.next());
            
        //  }

        System.out.println(set.size());
    }
    
}
