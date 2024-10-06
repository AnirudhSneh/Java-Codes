import java.util.*;
public class LargeSmallNuminArray {
    public static int GetSmallest(int Numbers[]){
        int smallest = Integer.MAX_VALUE;
        for(int i=0 ; i<Numbers.length ; i++){
            if(smallest > Numbers[i]){
                smallest = Numbers[i];
            }
        }
        return smallest;
    }
    public static int GetLargest(int Numbers[]){
        int largest = Integer.MIN_VALUE;// = - infinty, Integer.MAX_VALUE = + infinity.
        for(int i=0 ; i<Numbers.length ; i++){
            if(largest < Numbers[i]){
                largest = Numbers[i];
            }
        }
        return largest;
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            int Numbers[] = {1,23,45,76,98,102,52,3,25};
            System.out.println("Largest value is : " + GetLargest(Numbers));
            System.out.println("Smallest value is : " + GetSmallest(Numbers));
        }
    }
    
}
