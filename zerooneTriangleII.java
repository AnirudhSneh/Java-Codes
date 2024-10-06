import java.util.*;
public class zerooneTriangleII {

    public static void zeronetriangleII(int rows){
        for(int i=1; i<=rows ; i++){
            for(int k=1 ; k<= rows-i ;k++){
                System.out.print(" ");
            }
            for(int j=1; j<=i ; j++){
                if((i+j)%2!=0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            int rows = sc.nextInt();
            zeronetriangleII(rows);
        }
    }
    
}
