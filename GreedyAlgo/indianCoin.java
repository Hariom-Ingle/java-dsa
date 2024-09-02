package GreedyAlgo;

import java.util.*;
import java.util.Comparator;

public class indianCoin {
      //problem Statement :--

        // we are agiven an infinite  supply of  denominations [1,2,5,10,20,50,100,500,2000]
        //find min no  o the conis/notes to make  change for a value V;

        // v=121
        // ans 3 { 100+20+1}

        // code :---

    public static void main(String[] args) {
        
      Integer  coins[]={1,2,5,10,20,50,100,500,2000};
      // if we want to  reverse  the  arr in the using acomparator  then the datatype shoude  be Interger

      Arrays.sort(coins,Comparator.reverseOrder());
      
      int countofCoins=0;
      int amount= 590;
      ArrayList<Integer>ans= new ArrayList<>();

      for (int i=0;i<coins.length;i++){

        if(coins[i]<=amount){
            while (coins[i]<=amount) {
                countofCoins++;
                ans.add(coins[i]);
                amount-=coins[i];
                
            }
        }
      }
      System.out.println(" totol Coins/notes for chages are :"+countofCoins);


      for(int i=0;i<ans.size();i++){
        System.out.print(ans.get(i)+"  ");
      }

    }
    
}
