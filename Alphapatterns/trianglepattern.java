package Alphapatterns;

import java.util.Scanner;

public class trianglepattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int  col = sc.nextInt();

         for (int i =0; i< col;i++){
               for( int j =0 ; j<=i;j++){
                   System.out.print("* ");
               }
             System.out.println();
         }


    }
}
