package Hashing;
import java.util.*;


public class linkedHashMap {

    public static void main(String[] args) {
        LinkedHashMap<String, Integer>lhm= new LinkedHashMap<>();
        lhm.put("India", 100);
        lhm.put("Japan", 10);
        lhm.put("Pak", 20); 
        lhm.put("China", 50); 

        //Print LinkedHashMap 

        System.out.println(lhm);  // always give a orderd seq first in first out  like


        Set<String>Keys= lhm.keySet();
        System.out.println(Keys);

        for (String K : Keys) {
            System.out.println("Key  "+K+", value  "+lhm.get(K));
            
        }

    }

}
