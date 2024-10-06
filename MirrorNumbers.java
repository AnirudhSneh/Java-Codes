import java.util.*;
public class MirrorNumbers {
    public static void numbers(int rows){
        for(int i=1 ; i<=rows ; i++){
            for(int j=1 ; j<=i ; j++){
                System.out.print(j);
            }
            for(int j=1 ; j<=2*(rows-i); j++){
                System.out.print(" ");
            }
            for(int j=i ; j>=1 ; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            int rows = sc.nextInt();
            numbers(rows);
        }
    }
    
}
