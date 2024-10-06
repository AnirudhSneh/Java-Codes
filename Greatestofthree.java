import java.util.*;

public class Greatestofthree {
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();

            if(A>B && A>C){
                System.out.print("A is the largest number");
            }
            else if(B>C){
                System.out.print("B is the largest number.");
            }
            else{
                System.out.print("C is the largest number.");
            }
        }
    }
    
}
