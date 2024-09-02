package GreedyAlgo;

import java.util.Arrays;

public class minAbsoluteDifferencePair {

    public static void main(String[] args) {
        int arr1[]={1,4,8,7};
        int arr2[]={2,3,5,6};

      Arrays.sort(arr1);
      Arrays.sort(arr2);
      int sum=0;
      for(int i=0;i<arr1.length;i++){
        sum+=Math.abs(arr1[i]-arr2[i]);

      }
      System.out.println("Min absolute diff of pair is : "+sum);
    }
    

}


