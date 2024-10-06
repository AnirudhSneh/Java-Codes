import java.util.*;
public class Diamond{
    public static void diamond(int rows){
        for(int i=1 ; i<=rows ; i++){
            for(int j=1 ; j<=(rows-i) ; j++){
                System.out.print(" ");
            }
            for(int j=1 ; j<=(2*i-1) ; j++){//As we see that stars are in odd numbers,So it will be either in form(2n+1) or (2n-1).
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=rows ; i>=1 ; i--){
            for(int j=1 ; j<=(rows-i) ; j++){
                System.out.print(" ");
            }
            for(int j=1 ; j<=(2*i-1) ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            int rows = sc.nextInt();
            diamond(rows);
        }
    }
    
}
