package Hashing;

import java.util.HashMap;
//********** Problem Statement ************* */

// Find Itinerary from Tickets

// "Chennai" -> "Bengaluru" 
// "Mumbai" -> "Delhi" 
// "Goa" -> "Chennai" 
// "Delhi" -> "Goa"

// Ans path
// "Mumbai" -> "Delhi" -> "Goa" -> "Chennai" -> "Benagluru"

 

public class Q5_find_ItineraryFromTIckets {

    public static String getStart( HashMap<String,String> tickets){
        HashMap<String,String> revMap= new HashMap<>();
        for( String key: tickets.keySet()){
            revMap.put(tickets.get(key),key);
        }
        for(String key :tickets.keySet()){
            if(!revMap.containsKey(key)){
                return key;
            }

        }

        return null;
    }



  public static void main(String[] args) {
    HashMap<String,String>tickets= new HashMap<>();

    tickets.put("Chennai","Bengaluru");
    tickets.put("Mumbai","Delhi");
    tickets.put("Goa","Chennai");
    tickets.put("Delhi","Goa");

    String start= getStart(tickets);
    System.out.print(start);

    for (String key :tickets.keySet()) {

        System.out.print(" --> "+tickets.get(start));
        start=tickets.get(start);

        
    }
  }
    
}
