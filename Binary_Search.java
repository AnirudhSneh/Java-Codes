import java.util.*;
public class Binary_Search {
    public static int binarysearch(int Numbers[] , int key){
        int start = 0 , end = Numbers.length-1;
        while(start<=end){
          int mid = (start+end)/2;
          if(Numbers[mid] == key){
            return mid;
          }
          if(Numbers[mid] < key){//right.
            start = (mid+1);
          }
          else{//left.
            end = (mid-1);
          }
        }
        return -1;
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            int Numbers[] = {2,4,6,8,10,12,14};
            int key = sc.nextInt();
            int index = binarysearch(Numbers, key);
            if(index == -1){
                System.out.println("Value not present.");
            }
            else{
                System.out.println("The key is present at index : " + (index));
            }
        }
    }
    
}
