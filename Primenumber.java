import java.util.*;

public class Primenumber {
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the number : ");
            int n = sc.nextInt();
            int compos = 0;
            for(int i=2;i<n;i++){
                if(n % i == 0){
                    compos = 1;
                    break;
                }

            }
            if(compos == 1){
                System.out.println("The number is composite.");
            }
            else if(n == 1 || n == 0){
                System.out.println("The number is neither prime nor composite.");
            }
            else{
                System.out.println("The nummber is prime.");
            }
        }
    }
    
}
