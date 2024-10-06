import java.util.*;

public class Conditionalstat {
    public static void main(String args[]){
       try(Scanner sc = new Scanner(System.in)){
        int age = sc.nextInt();
        if(age >= 18){
            System.out.println("Adult : can drive , can vote.");
        }
        else if(age>12 && age<18){
            System.out.println("Teenager");
        }
        else{
            System.out.println("Not Adult.");
        }

            int A = sc.nextInt();
            int B = sc.nextInt();

            if(A > B){
                System.out.println("A is greater than B.");
            }
            else{
                System.out.println("B is greater than A.");
            }
            if(A%2==0){
                System.out.println("A is even.");
            }
            else{
                System.out.println("A is odd.");
            }       
            
        }
    }
}                  
    
    

