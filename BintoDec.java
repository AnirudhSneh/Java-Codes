import java.util.*;
public class BintoDec {
    public static void bintodec(int BinNum){
        int MyNum = BinNum;
        int pow = 0;
        int DecNum = 0;
        while(BinNum > 0){
            int lastdigit = BinNum % 10;
            DecNum = DecNum + (lastdigit *(int)Math.pow(2,pow));
            pow++;
            BinNum = BinNum / 10;
        }
        System.out.println("Decimal of " + MyNum + " = " + DecNum);
    }
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)){
            int BinNum = sc.nextInt();
            bintodec(BinNum);
        }
    }
}
