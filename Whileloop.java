import java.util.*;

public class Whileloop {

    public static void main(String args[]){
        try(Scanner sc= new Scanner(System.in)){
        int counter = 0;
        while(counter<10){
            System.out.println("Hello World");
            counter++;
        }
        System.out.println("Printed HW 10 times.");
        
        int range = sc.nextInt();//printing numbers from 1 to n.
        int number = 1;
        while(number<=range){
            System.out.println(number + " ");
            number++;
        }
        int n = sc.nextInt();
        int i = 1;
        int sum = 0;
        while(i<=n){
            sum += i;
            i++;
        }
        System.out.println("sum = " + (sum));
        
        }

    }
}
