import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int fact=1;

        Scanner sc=new Scanner(System.in);

        int input=sc.nextInt();
        int i ;
        for ( i=1; i<=input; i++){
            fact*=i;

        }
        System.out.println("The factorial of "+input+" is:"+fact);
    }
}
