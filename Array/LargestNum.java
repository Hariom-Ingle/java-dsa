// package Array;

public class LargestNum {



    public static  int LargeNum(int number[]){
        int largest = Integer.MIN_VALUE; //minus infinity
        int smallestval= Integer.MAX_VALUE;

        for (int i=0;i<number.length;i++){
            if (largest<number[i]){
                largest=number[i];
            }
            if (smallestval>number[i]){
                smallestval=number[i];
            }
        }
        System.out.println("Smallest value is "+smallestval);
        return largest;

    }

    public static void main(String[] args) {
        int number[]={1,5,7,6,8,6,1};

        System.out.println("largest Valueis "+LargeNum(number));

    }
}

