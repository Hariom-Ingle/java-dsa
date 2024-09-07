package Hashing;

import java.util.HashMap;
import java.util.Set;

public class Q1_majorityElements {

    public static void main(String[] args) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // int arr []={1,3,2,5,1,3,1,5,1};
        int arr[] = { 1, 2 };

        // // loop to store the Element Frequency in hashmap

        // for (int i = 0; i < arr.length; i++) {
        // int num = arr[i];

        // if (map.containsKey(num)) {
        // map.put(num, map.get(num) + 1);
        // } else {

        // map.put(num, 1);

        // }
        // }

        // // to get element which has frequncy greater than n/3

        // int n = arr.length;
        // Set<Integer> keySet = map.keySet();

        // for (Integer key : keySet) {

        // if (map.get(key) > arr.length / 3) {
        // System.out.println(key);
        // }
        // }

        // ******************* Short hand code ************

        for (int i = 0; i < arr.length; i++) {

            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

            // arr[i], map.getOrDefault(arr[i], 0) + 1  == tjis line means get value att arr[i] othewise default value 0  and +1  for both 

        }

        for (Integer key : map.keySet()) {

            if (map.get(key) > arr.length / 3) {
                System.out.println(key);
            }
        }

    }

}
