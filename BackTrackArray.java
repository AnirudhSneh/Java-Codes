public class BackTrackArray {
    public static void ChangeArr(int arr[] , int i , int val){//TC = O(N) , SC = O(N)
        //base case
        if(i == arr.length){
            printArr(arr);
            return;
        }
        //recursion
        arr[i] = val;
        ChangeArr(arr , i+1 , val+1);//function call step
        arr[i] = arr[i] - 2;//backtracking step
    }
    public static void printArr(int arr[]){
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String args[]){
        int arr[] = new int[5];
        ChangeArr(arr, 0, 1);
        printArr(arr);
    }
}
