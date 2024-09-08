package Hashing;

import java.util.HashSet;

public class hashSet_Operations {
    public static void main(String[] args) {
        
    HashSet <Integer> set = new HashSet<>();

    set.add(1);
    set.add(2);
    set.add(3);
    set.add(4);
    set.add(5);
    set.add(6);

    System.out.println( set);
    
    set.remove(2);
    
    System.out.println( set);
    System.out.println( set.size());
    set.clear();
    System.out.println(set.isEmpty());
    

    if( set.contains(1)){
        System.out.println("Set Conatain 2");
    }
    
    }
    
    
}
