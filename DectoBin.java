import java.util.*;
public class DectoBin {
    public static void dectobin(int DecNum){
        int MyNum = DecNum;
        int pow = 0;
        int BinNum = 0;
        while(DecNum > 0){
            int rem = DecNum % 2;
            BinNum = BinNum + (rem *(int)Math.pow(10,pow));
            pow++;
            DecNum = DecNum / 2;
        }
        System.out.println("Binary of " + MyNum + " = " + BinNum); 
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            int DecNum = sc.nextInt();
            dectobin(DecNum);
        }
    }
    
}
