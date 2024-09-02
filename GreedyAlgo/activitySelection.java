package GreedyAlgo;

import java.util.*;

public class activitySelection {

    public static void activity() {
        int start[] = { 1, 3, 0, 5, 8, 5 };
        int end[] = { 2, 4, 6, 7, 9, 9 };

        // this step only for the sorting of the given array on the basic of the end
        // time
        // *********** IF ARRAY IS NOT ALREADY SORTED
        int activities[][] = new int[start.length][3];

        for (int i = 0; i < start.length; i++) {
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }
        // This step is for the shorting the new activities array ion the basic of the 3
        // rd colm i.e the end colm
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));

        // end time basis sorting
        int maxAct = 0;

        ArrayList<Integer> ans = new ArrayList<>();
        
        // step for the first activity
        maxAct=1;
        ans .add(activities[0][0]); // alternative step  if already sorted  ---> ans.add(start[0]);
        int lastend=activities[0][2]; // alternative step  if already sorted  --->int  lastend=end[0];

        for (int i=1; i<end.length;i++){
            if(activities[i][1]>lastend){
                ans .add(activities[i][0]);
                lastend=activities[i][2];
            }
        }

        System.err.println("Max Activitys ="+ maxAct);

        for(int i =0;i<ans.size();i++){
            System.out.print("A"+ans.get(i)+" ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        activity();

        // NOTE: if we are useing a sorting technique  then the  time complx --> nlog(n)
    }
}

