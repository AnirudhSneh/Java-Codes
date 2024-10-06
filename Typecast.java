import java.util.*;

public class Typecast {
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            float marks1 = 99.999f;
            int marks2 = (int)marks1;
            System.out.println(marks2);
            char ch = 'a';
            int number = ch;
            System.out.println(number);
        }
        
        
    }
    
}
