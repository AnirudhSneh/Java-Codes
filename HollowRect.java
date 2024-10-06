import java.util.*;
public class HollowRect {
    public static void Hollow_Rect(int totRows, int totCols){
        for(int i=1;i<=totRows;i++){
            for(int j=1;j<=totCols;j++){
                if(i==1 || i==totRows || j==1 || j==totCols){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            int totRows = sc.nextInt();
            int totCols = sc.nextInt();
            Hollow_Rect(totRows, totCols);
        }
    }
}
