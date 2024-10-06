import java.util.*;

public class Multiplication {
    public static void multiply(int a , int b){
        int product = a * b;
        System.out.println("a * b = " + product);
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            int a = sc.nextInt();
            int b = sc.nextInt();
            multiply(a,b);
        }
    }
    
}
