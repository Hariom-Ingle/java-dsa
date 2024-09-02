import java.util.Scanner;

public class problem1 {
    public   static void main( String [] args){

        Scanner sc =new Scanner(System.in);
        System.out.print( "Enter a Number :- ");
        int n = sc.nextInt();
        int i=0;

        while(n>0){
            n/=10;
//            System.out.println(n);
            i++;

        }
        System.out.println( "Number Of Digit in the Given Number are :"+i);

    }
}
