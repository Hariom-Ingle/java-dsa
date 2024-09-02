// package Array;

public class Maxsubarraysum {

    public static void subarray(int numbers[]){

        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length; i++){
            int start=i;

            for (int j=i;j<numbers.length;j++){
                int end=j;
                int currentsum = 0;
                for(int k=start;k<=end;k++){
                    System.out.print(numbers[k]+"  ");
                    currentsum=currentsum+numbers[k];

                }
                System.out.print("current Sum "+currentsum);
                System.out.println();

                if(maxsum<currentsum){
                    maxsum=currentsum;
                }
            }

            System.out.println();
        }
        System.out.println("maxsum"+maxsum);

        return;
    }

    public static void main(String[] args) {
        int numbers[] = {1, 2, -3, 4, -6, 7};

        subarray(numbers);

    }
}