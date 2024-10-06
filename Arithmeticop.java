import java.util.*;

public class Arithmeticop {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = 10 , b = 15;
            int sum = a + b;
            System.out.println(sum);
            int c = sc.nextInt();
            int d = sc.nextInt();
            float rad = sc.nextFloat();
            int SUM = c + d;
            int PRODUCT = c*d;
            float AREA = 3.14f*rad*rad;/*This f signifies that the value 3.14 is a float value,otherwise it will see 3.14 or any other decimal value as double value and give
                                         error "mismatch cannot convert from double to float".*/  
            System.out.println(SUM);
            System.out.println(PRODUCT);
            System.out.println(AREA);
        }
    }   
}
