import java.util.*;

public class Dowhileloop {
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
        int counter = 1;
        do{
            System.out.println("Hello World");
            counter++;
        }while(counter <=10); 
        for(int i=1;i<=5;i++){
            if(i == 3){
                continue;
            }
            System.out.println(i);
        }
        do{
            System.out.println("Enter number : ");
            int n = sc.nextInt();
            if(n%10==0){
                continue;
            }
            System.out.println("number was : " + n);

        }while(true);
    }
}
}
