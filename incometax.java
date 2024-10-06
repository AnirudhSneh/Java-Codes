import java.util.*;

public class incometax {
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            float income = sc.nextFloat();
            float tax = 0;
            if(income < 250000){
                System.out.println("Tax = "+ (0.0f*(tax)));
            }
            else if(income >= 250000 && income <=500000){
               System.out.println("Tax = "+ (tax = tax + 0.05f*(income - 250000)));
            }
            else if(income >= 500000 && income <= 1000000){
               System.out.println("Tax = "+(tax = tax + 0.20f*(income-500000)));
            }
            else{
                System.out.println("Tax = "+(tax = tax + 0.30f*(income-1000000)));
            }

        }
        
    }
}
