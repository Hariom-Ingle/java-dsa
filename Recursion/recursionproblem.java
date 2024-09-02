package Recursion;

public class recursionproblem {

    //******************************************************//
    //--------------- Print in Increaing  order ------------//
    //++++++++++++++++++++++++++++++++++++++++++++++++++++++//
     public static  void  printDec(int n){

         if (n==1){
             System.out.print(n+" ");
             return;
         }
         System.out.print(n+" ");
         printDec(n-1);
     }

    //******************************************************//
    //--------------- Print in Decreasing order ------------//
    //++++++++++++++++++++++++++++++++++++++++++++++++++++++//
    public static  void  printInc(int n){

        if (n==1){
            System.out.print(n+" " );
            return;
        }
        printInc(n-1);
        System.out.print(n+" ");
    }


    //******************************************************//
    //--------------- Print in Factorial ------------//
    //++++++++++++++++++++++++++++++++++++++++++++++++++++++//
    public static  int  fact(int n){

        if (n==0){
            return 1;
        }
        int SN1= fact(n-1);
        int result=  n*SN1;
        return  result;
    }

    //******************************************************//
    //------------  Print in Sum of n natural no------------//
    //++++++++++++++++++++++++++++++++++++++++++++++++++++++//
    public static  int  calSum(int n){

        if (n==1){
            return 1;
        }
         int SN1= calSum(n-1);
        int result=  n+SN1;
        return  result;
    }


    //******************************************************//
    //------------  Fobunacci serirs------------//
    //++++++++++++++++++++++++++++++++++++++++++++++++++++++//
    public static  int  fb(int n){

        if (n==0 ||  n==1){
            return n;
        }
        int Fbm1= fb(n-1);
        int fbm2=  fb(n-2);
        return  Fbm1+fbm2;
    }

    public  static  boolean   isSorted( int arr[] ,int i){

         if(i == arr.length-1){
             return true;
         }
         if (arr[i]>arr[i+1]){
             return  false;

         }
         return isSorted(arr,i+1);
    }




    public static void main(String[] args) {
//        System.out.println("Decregin order");
//                 printDec(10);
//        System.out.println();
//        System.out.println("Incresing order");
//        System.out.println("factorial of 5 is "+fact(5));
//        System.out.println("Sum of 5 is "+calSum(5));

//        System.out.println("fubinacci of 5000 is "+fb(0));
        int arr[]={1,2,3,4,5};

        System.out.println(isSorted(arr,0   ));

    }
}
