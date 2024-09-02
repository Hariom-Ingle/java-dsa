package FunctionorMethods;
import java.util.Scanner;
public class Factorial {
    public static  int  factorial(int d ){
        int fact=1;
        for (int i=1; i<= d;i++){
            fact=fact*i;
        }
        return  fact;
    }

    public  static  int binomiaclcoffe(int n, int r){
        int n_fact=factorial(n);
        int r_fact=factorial(r);
        int nmr_fact= factorial(n-r);

        int resultcoff= n_fact/(r*nmr_fact);

        return  resultcoff;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n :");
        int n = sc.nextInt();

        System.out.printf("Enter r :");
        int r = sc.nextInt();

        int result = binomiaclcoffe(n,r);

        System.out.println( "Binomial Cofficent  is :"+result);
//     int result=   factorial(input);
//        System.out.println("Factorial "+result);

    }
}
