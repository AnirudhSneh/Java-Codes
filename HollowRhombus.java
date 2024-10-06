import java.util.*;
public class HollowRhombus {
    public static void Rhombus(int rows){
        for(int i=1 ; i<=rows ; i++){
            for(int j=1 ; j<=(rows-i) ; j++){
                System.out.print(" ");
            }
            for(int j=1 ; j<=rows ; j++){
                if(i==1 || i==rows || j==1 || j==rows){//column=rows bcz its a rhombus and not a parallelogram.
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
            int rows = sc.nextInt();
            Rhombus(rows);
        }
    }
    
}
