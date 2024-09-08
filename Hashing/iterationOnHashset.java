package Hashing;

import java.util.HashSet;
import java.util.Iterator;

public class iterationOnHashset {

    public static void main(String[] args) {

        HashSet<String> cities = new HashSet<>();
        cities.add("Akola"); 
        cities.add("Yavatmal"); 
        cities.add("Amaravti"); 
        cities.add("Noida"); 
        cities.add("Jaipur"); 
        

        //  Iterator it= cities.iterator();

        //  while (it.hasNext()) {
        //     System.out.println(it.next() );
            
        //  }


        // USING ADVANCED LOOP

      for (String city : cities) {

        System.out.println(city);
      }

    }
    
}
