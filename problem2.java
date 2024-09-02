import java.util.Scanner;

public class problem2 {
    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int m = sc.nextInt();
    int sumofdigit=0;

    while(m>0){

        sumofdigit+=m%10;
        m=m/10;
    }
        System.out.println("Sum of digit  is :"+sumofdigit);



    }

}
