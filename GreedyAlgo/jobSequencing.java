package GreedyAlgo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class jobSequencing {
    // Job Sequencing Problem

    // Given an array of jobs where every job has a deadline and profit if the job
    // is finished before the deadline. It is also given that every job takes a
    // single unit of time, so the minimum possible deadline for any job is 1.
    // Maximize the total profit if only one job can be scheduled at a time.

    // Job A = 4, 20
    // Job B = 1, 10
    // Job C = 1, 40
    // Job D = 1, 30
    // ans = C, A

    // define a object class
    static class job {
        int deadline;
        int profit;
        int id;

        public job(int i, int d, int p) {
            id = i;
            deadline = d;
            profit = p;
        }
    }

    public static void main(String[] args) {

        // step 1: sort on the basis of the profit

        int jobsInfo[][] = { { 4, 20 }, { 1, 10 }, { 1, 40 }, { 1, 30 } };

        // creating a job object
        ArrayList<job> jobs = new ArrayList<>();

        for (int i = 0; i < jobsInfo.length; i++) {
            jobs.add(new job(i, jobsInfo[i][0], jobsInfo[i][1]));

        }

        Collections.sort(jobs,(obj1,obj2)->obj2.profit-obj1.profit); //nndecending order sorting 

        ArrayList<Integer>seq= new ArrayList<>();
        int time=0;

        for(int i = 0;i<jobs.size();i++){
            job curr= jobs.get(i);
            if(curr.deadline>time){
                seq.add(curr.id);
                time++;

            }
        }

        // print seq
        System.out.println("max jobs="+seq.size());
        for(int i = 0;i<seq.size();i++){
            System.out.print(seq.get(i)+" ");
        }
        System.out.println();

    }
}
