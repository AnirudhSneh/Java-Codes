import java.util.*;

public class OptimizedPrime {
    public static boolean isPrime(int n){
        if(n==0 || n==1){
            return false;
        }
        else{ 
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
    }
    return true;
}

    public static void PrimesinRange(int n){
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            int n =sc.nextInt();
            System.out.println(isPrime(n));
            PrimesinRange(n);
        }
    }
    
}
