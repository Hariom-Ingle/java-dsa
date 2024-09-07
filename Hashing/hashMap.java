package Hashing;
import java.util.*;


public class hashMap {

    public static void main(String[] args) {
        TreeMap<String, Integer>tm= new  TreeMap<>();
        tm.put("India", 100);
        tm.put("Japan", 10);
        tm.put("Pak", 20); 
        tm.put("China", 50); 

        //Print LinkedHashMap 

        System.out.println(tm);  // always give a orderd seq first in first out  like


        Set<String>Keys= tm.keySet();
        System.out.println(Keys);

        for (String K : Keys) {
            System.out.println("Key  "+K+", value  "+tm.get(K));
            
        }

    }

}
