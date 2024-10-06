import java.util.*;

public class CharPattern {
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the value of n :");
            int n = sc.nextInt();
            char ch = 'A';
            for(int line=1;line<=n;line++){
                for(int chars=1;chars<=line;chars++){
                    System.out.print(ch);
                    ch++;
                }
                System.out.println();
            }
        }
    }
}
