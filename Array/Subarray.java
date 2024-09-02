// package Array;

public class Subarray {

    public static void subarray(int numbers[]){

        for(int i=0;i<numbers.length; i++){
            int start=i;
            for (int j=i;j<numbers.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){
                    System.out.print(numbers[k]+"  ");
                }
                System.out.println();
            }
            System.out.println();
        }

        return;
    }

    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 4, 6, 7};

        subarray(numbers);

    }
}