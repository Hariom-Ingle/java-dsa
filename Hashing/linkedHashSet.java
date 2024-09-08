package Hashing;

import java.util.*;

public class linkedHashSet {
    
    
    public static void main(String[] args) {

        HashSet<String> cities = new HashSet<>();
        cities.add("Akola"); 
        cities.add("Yavatmal"); 
        cities.add("Amaravti"); 
        cities.add("Noida"); 
        cities.add("Jaipur"); 

        System.out.println(" Using HashSet");
        System.out.println(cities);

        LinkedHashSet<String>lhs= new LinkedHashSet<>();

        lhs.add("Akola"); 
        lhs.add("Yavatmal"); 
        lhs.add("Amaravti"); 
        lhs.add("Noida"); 
        lhs.add("Jaipur"); 
        
        System.out.println(" Using LinkedHashSet");
        System.out.println(lhs);

        //  Iterator it= lhs.iterator();

        //  while (it.hasNext()) {
        //     System.out.println(it.next() );
            
        //  }

TreeSet<String>ths= new TreeSet<>();
         
        ths.add("Akola"); 
        ths.add("Yavatmal"); 
        ths.add("Amaravti"); 
        ths.add("Noida"); 
        ths.add("Jaipur"); 

        System.out.println(" Using LinkedHashSet");
        System.out.println(ths);


        

        //  Iterator ith= ths.iterator();

        //  while (ith.hasNext()) {
        //     System.out.println(ith.next() );
            
        //  }

 

     
    }
    

}
