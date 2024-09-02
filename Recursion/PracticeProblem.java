package Recursion;

public class PracticeProblem {
    //problem 1
    public  static void    findIndices( int []arr, int key,int index){
        if(index==arr.length){
            return;
        }
        if (arr[index]==key){
            System.out.println(index);
        }
         findIndices(arr,key,index+1);
    }

    static String digits[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
    public static  void Notoword(int num ){


        if(num==0){
            return;
        }

        int lastdigit=num%10; // this  will give the last digit of  the number series

        Notoword(num/10); // this will decrease the number by the last place

        System.out.printf(digits[lastdigit]+" ");







    }

    public static void main(String[] args) {
//        int arr[]={4,2,6,8,2,3,2};
//        findIndices(arr,2,0);

        Notoword(2019);


    }
}


