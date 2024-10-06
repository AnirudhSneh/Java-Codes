import java.util.*;
public class SquareOfNumbers {
    public static void Square(int n){
        int N = 2*n-2;
        for(int row=0 ; row<=N ; row++){
            for(int col=0 ; col<=N ; col++){
                int AtEveryIndex = n-Math.min(Math.min(row,col) , Math.min(N-row,N-col));
                System.out.print(AtEveryIndex + " ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            Square(n);
        }
    }
    
}
