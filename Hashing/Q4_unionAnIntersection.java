package Hashing;

import java.util.*;

public class  Q4_unionAnIntersection {


public static void main(String[] args) {

    int arr1[]={7,9,3};
    int arr2[]={6,9,3,2,9,4};

    HashSet<Integer> set= new HashSet<>();

    // Union 
    for(int i=0;i<arr1.length;i++){
        set.add(arr1[i]);
    }
    for(int i=0;i<arr2.length;i++){
        set.add(arr2[i]);
    }

    System.out.println("union Size="+set.size());
    System.out.println(set);
    
    // intersection
    set.clear();

    for(int i=0;i<arr1.length;i++){
        set.add(arr1[i]);
    }


    int count=0;
    for(int i=0;i<arr2.length;i++){
        if(set.contains(arr2[i])){
            count++;
            System.out.print(arr2[i]+" ");
            set.remove(arr2[i]);
        }
     
    }
    System.out.println();
    System.out.println("Intersection Count "+count);
    

    

}


    
    
}
