import java.util.*;
public class NextGreater {
    public static void nextgreater(int arr[] , int nxtgrtr[]){//TC=O(N).
        Stack<Integer> s = new Stack<>();

        for(int i=arr.length-1 ; i>=0 ; i--){

            while(!s.isEmpty() && arr[s.peek()] <= arr[i]){
                s.pop();
            }

            if(s.isEmpty()){
                nxtgrtr[i] = -1;
            }
            else{
                nxtgrtr[i] = arr[s.peek()];
            }

            s.push(i);
        }
    }
    public static void main(String args[]){
        int arr[] = {6,8,0,1,3};
        int nxtgrtr[] = new int[arr.length];
        nextgreater(arr, nxtgrtr);
        for(int i=0 ; i<nxtgrtr.length ; i++){
            System.out.print(nxtgrtr[i] + ",");
        }
        
    }
}
