package Hashing;

import java.util.HashMap;

//   ********************** problem Statement *****************
// Valid Anagram 
// Given two strings s and t, return true if t is an anagram of s, and false otherwise.
// An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

// s = "race" t="care"

// TRUE

// s = "heart" t="earth"

// TRUE

// FALSE

// s = "tulip" t = "lipid"

 

public class Q2_validAnagram {
    public static boolean isanagram(String s, String t) {
        if( s.length()!=t.length()){
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            if (map.get(ch) != null) {
                if (map.get(ch) == 1) {
                    map.remove(ch);
                } else {
                    map.put(ch, map.get(ch) - 1);
                }
            } else {
                return false;
            }

        }

        return map.isEmpty();
    }

    public static void main(String[] args) {

         String s = "neek";
         String t = "keen";

          System.out.println(isanagram(s, t));

    }

}
