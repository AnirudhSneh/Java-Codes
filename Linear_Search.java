import java.util.*;
public class Linear_Search {//Time complexity = O(n).
    public static int linearsearch(int Numbers[],int key){
        for(int i=0; i<Numbers.length ; i++){
            if(Numbers[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            int Numbers[] = {2,4,5,7,8,12,34,65,32};
            int key = sc.nextInt();
            int index = linearsearch(Numbers, key);
            if(index == -1){
                System.out.println("Value not present.");
            }
            else{
                System.out.println("The Key is at index " + (index));
            }
        }
    }
    
}
