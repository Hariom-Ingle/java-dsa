package SortingAlgo;

// import jdk.jshell.spi.SPIResolutionException;

import java.util.Scanner;

public class SortingAlgo {

    public  static  void bubblesort(int input[]){
        int swap=0;
        boolean swapped;
         for (int turn=0;turn<input.length-1;turn++){
             swapped = false;
             for(int j =0; j<input.length-1-turn;j++){
                 if(input[j]>input[j+1]){
                     int temp=input[j];
                     input[j]=input[j+1];
                     input[j+1]=temp;
                 }
                 swap++;
             }
             if (!swapped) {
                 break;  // No swaps means the array is already sorted
             }
         }
        System.out.println("swap count "+swap);
    }


    public static  void selectionsort(int input[]){

        for(int  i=0;i<input.length;i++){
            int minpos=i;
            for(int j=i+1;j<input.length;j++){
                if(input[minpos]>input[j]){
                    minpos=j;
                }
            }
            int temp= input[minpos];
            input[minpos]=input[i];
            input[i]=temp;

        }
    }

    public  static  void  Insertationsort(int input[]){

        for(int i=1;i<input.length;i++){
            int curr=input[i];
            int prev=i-1;


            // finding out the current position to place  element
            while (prev >= 0 && input[prev]>input[i]){
                input[prev+1]=input[prev];
                prev--;
            }
            input[prev+1]=curr;

        }
    }


    public  static void  Countingsort(int input[]){
        int largest=Integer.MIN_VALUE;

        // to find the large no
        for (int i=0;i<input.length;i++){
            largest=Math.max(largest,input[i]);// to find  the largest elemement from the array
        }
        int count[]= new int[largest+1];
        // to set the freqn of each element in the array
        for (int i=0;i<input.length;i++){
            count[input[i]]++; // the freqn for the similar element will incrase automatically
        }
        System.out.println();
        printarr(count);
        System.out.println();




        // to fix the sorted in the orignal array
        int j=0;
        for(int i =0;i<count.length;i++){
            while (count[i]>0){
                input[j]=i;
                j++;
                count[i]--;
            }
        }


    }
    public static  void printarr(int input[]){
        for(int i= 0;i< input.length;i++){
            System.out.print(" "+input[i]);
        }

    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of  the array:" );
        int size= sc.nextInt();
        int array[]=new int[size];

        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }
        printarr(array);
        System.out.println();

        //*********** Bubble Sort ************ //
//        bubblesort(array);
//        System.out.println("Array After Sorting ");
//        printarr(array);

        //*********** Selection Sort ************ //
//        selectionsort(array);
//        System.out.println("Array After Sorting ");
//        printarr(array);

        //*********** Selection Sort ************ //
//        Insertationsort(array);
//        System.out.println("Array After Sorting ");
//        printarr(array);

        //*********** Selection Sort ************ //
        Countingsort(array);
        System.out.println("Array After Sorting ");
        printarr(array);


    }
}
