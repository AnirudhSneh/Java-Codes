import java.util.*;

public class Factorial{
    public static int factorial(int n){
        if(n==1 || n==0){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }
    public static int binCoeff(int n , int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);
        int binCoeff = fact_n/(fact_r*fact_nmr);
        return binCoeff;
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int r = sc.nextInt();
            System.out.println(factorial(n));
            System.out.println(binCoeff(n,r));

        }
    }
}