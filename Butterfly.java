import java.util.*;
public class Butterfly {
    public static void butterfly(int rows){
        //outer loop-1st half.
        for(int i=1 ; i<=rows ; i++){
            //stars - i.
            for(int j=1 ; j<=i ; j++){
                System.out.print("*");
            }
            //spaces = 2*(rows-j).
            for(int j=1 ; j<=2*(rows-i) ; j++){
                System.out.print(" ");
            }
            //stars-i.
            for(int j=1 ; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //outer loop-2nd half or mirror image.
        for(int i=rows ; i>=1 ; i--){
             //stars - i.
             for(int j=1 ; j<=i ; j++){
                System.out.print("*");
            }
            //spaces = 2*(rows-j).
            for(int j=1 ; j<=2*(rows-i) ; j++){
                System.out.print(" ");
            }
            //stars-i.
            for(int j=1 ; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            int rows = sc.nextInt();
            butterfly(rows);
        }
    }
}
