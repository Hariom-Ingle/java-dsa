package BitManipulation;

import java.util.Scanner;

public class Oddevenfind {


//    ************** Find ODD and Even ****************

//    public  static  void findoddeven(int n){
//        int bitMask=1;
//        if ((n & bitMask)==1){
//            System.out.println( n+" is odd no");
//        }else {
//            System.out.println( n+" is even no");
//        }
//    }



//    ************** Get Bit  ****************

    public  static  void getBit(int n ,int i){
        int bitMask=(1<<i);
        if ((n & bitMask)==0){
            System.out.println("Bit present at "+i+" place is 0");
        }else {
            System.out.println("Bit present at "+i+" place is 1");

        }
    }

////    ************* Set Bit  ****************
//
//    public  static  int  setBit(int n, int i){
//        int bitMask =(1<<i);
//        return n|bitMask;
//    }

//   ************* Set Bit  ****************
//
//    public  static  int  clearBit(int n, int i){
//        int bitMask =~(1<<i);
//        return n&bitMask;
//
//    ************* clear  Bit  ****************

//    public  static  int  clearBit(int n, int i){
//        int bitMask =~(1<<i);
//        return n&bitMask;
//    }



    //    ************* Update  Bit  ****************
//    public  static  int  updatebit(int n, int i ,int newbit){
//        n = clearBit( n, i);
//
//        int bitMask =(newbit<<i);
//        return n|bitMask;
//
//    }
//      ************* Update  Bit  ****************
//    public  static  int  clearlastbits(int n, int i ){
//        int maskBit = ((~0) << i);
//
//        return n & maskBit;
//    }

//     ************* find no of set   Bit  ****************
public static void countSetBits(int n, int i) {
    int count = 0;
    while (n > 0) {
        if ((n & 1) != 0) {
            count++;
        }
        n = n >> 1;
    }
    System.out.println("Number of set bits in number " + i + " is: " + count);
}
//    public  static  int  clearbitrange(int n, int i ,int j){
//        int a= clearlastbits(n,(j+1));
//        int b=(1<<i)-1;
//        int maskBit = a|b;
//
//        return n & maskBit;
//    }
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.print( " Enter Decimal Number :");
        int n= sc.nextInt();
//        findoddeven(3);
        System.out.print( " Set the bit at  place no :");
        int i= sc.nextInt();

//        System.out.print( " Enter the new bit :");
//        int newbit= sc.nextInt();

//        System.out.print( " Enter the second bit renge :");
//        int endbit= sc.nextInt();


//        getBit( n ,i);
//        System.out.println(    clearBit(n, i,newbit ));
//        System.out.println(    updatebit(n, i,newbit ));
//                System.out.println(     clearbitrange(n, i,endbit));

        countSetBits(n,i);




    }
}
