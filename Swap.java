import java.util.*;

public class Swap {
    public static void swap(int a , int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a = "+ a);
        System.out.println("b = "+ b);
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            int a = sc.nextInt();
            int b = sc.nextInt();
            swap(a,b);
            System.out.println("a = "+ a);
            System.out.println("b = "+ b);/*We see that when syso(a),syso(b) is given in main the values of a and b doesn't change/swap.Java always call by value
            ,so when swap(a,b) is called a copy of a and b from main is passed to the function.So on swapping there will be change in the values in function but 
            there will be no change in actual values itself.When original value is passed it is known as call by reference. */
        }
    }
}
