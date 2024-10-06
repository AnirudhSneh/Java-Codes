import java.util.*;

public class Switchcase {
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            int number = sc.nextInt();

            switch(number){
                case 1 : System.out.println("outstanding");
                break;
                case 2 : System.out.println("excellent");
                break;
                case 3 : System.out.println("good");
                break;
                default : System.out.println("average");
                //it is not necessary that cases are always integers,it can be char ,float too.
            }

        }
    }
    
}
