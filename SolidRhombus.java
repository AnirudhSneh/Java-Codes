import java.util.*;
public class SolidRhombus {
    public static void Rhombus(int rows){
        for(int i=1 ; i<=rows ; i++){
            for(int j=1 ; j<=(rows-i) ; j++){
                System.out.print(" ");
            }
            for(int j=1 ; j<=rows ; j++){
                System.out.print("*");
            }
            for(int j=1 ; j<=(i-1) ; j++){//We do not need to write this loop bcz the empty spaces after stars doesn't matter.
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            int rows = sc.nextInt();
            Rhombus(rows);
        }
    }
    
}
