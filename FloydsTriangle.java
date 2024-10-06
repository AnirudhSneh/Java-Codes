import java.util.*;
public class FloydsTriangle {
    public static void floydstriangle(int rows){
        int counter = 1;
        for(int i=1 ; i<=rows ; i++){
            for(int j=1 ; j<=i ; j++){
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            int rows = sc.nextInt();
            floydstriangle(rows);
        }
    }
}
