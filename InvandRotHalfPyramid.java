import java.util.*;
public class InvandRotHalfPyramid {
    public static void inverted_rotated_halfpyramid(int rows){
        for(int i=1 ; i<=rows ; i++){
            for(int j=1 ; j<=rows-i ; j++){
                System.out.print(" ");
            }
            for(int j=1 ; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void inverted_halfpyramid_withnumber(int rows){
        for(int i=1 ; i<=rows ; i++){
            for(int j=1 ; j<=rows-i+1 ; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }  
    public static void inverted_mirrorhalfpyramid_withnumber(int rows){
        for(int i=rows ; i>=1 ; i--){
            for(int j=0 ; j<rows-i ; j++){
                System.out.print(" ");
            }
            for(int j=i ; j>=1 ; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String arg[]){
        try(Scanner sc = new Scanner(System.in)){
            int rows = sc.nextInt();
            inverted_rotated_halfpyramid(rows);
            System.out.println("---------------");
            inverted_halfpyramid_withnumber(rows);
            System.out.println("---------------");
            inverted_mirrorhalfpyramid_withnumber(rows);
            
        }
    }
    
}
