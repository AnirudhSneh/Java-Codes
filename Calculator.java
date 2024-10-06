import java.util.*;

public class Calculator {
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)){
            System.out.println("Enter a :");
            float a = sc.nextFloat();
            System.out.println("Enter b :");
            float b = sc.nextFloat();
            System.out.println("Enter operator :");
            char operator = sc.next().charAt(0);

            switch(operator){
                case '+': System.out.println(a+b);
                break;
                case '-': System.out.println(a-b);
                break;
                case '*': System.out.println(a*b);
                break;
                case '/': System.out.println(a/b);
                break;
                default: System.out.println("Error");
            }
        }
    }
    
}
