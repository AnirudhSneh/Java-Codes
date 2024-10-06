import java.util.*;
public class RecursionBasics {
    public static void printDec(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printDec(n-1);
    }
    public static void printInc(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        printInc(n-1);
        System.out.println(n);
    }
    public static int Factorial(int n){//TC = O(N) , SC = O(N).
        if(n==0){
            return 1;
        }
        else{
            return n*Factorial(n-1);
        }
    }
    public static int Sum(int n){//TC = O(N) , SC = O(N).
        if(n==0){
            return 0;
        }
        else{
            return n + Sum(n-1);
        }
    }
    public static int Fibonacci(int n){//TC = O(2^N) , SC = O(N).
        if(n==0 || n==1){
            return n;
        }
        else{
            return Fibonacci(n-1) + Fibonacci(n-2);
        }

    }
    public static boolean isSorted(int arr[],int i){//TC = O(N) , SC = O(N).
        if(i==arr.length-1){
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }
        return isSorted(arr,i+1);
    }
    public static int FirstOccurence(int arr[] , int key , int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){//compare with self.
            return i;
        }
        return FirstOccurence(arr, key, i+1);//then look forward.
    }
    public static int LastOccurence(int arr[], int key , int i ){
        if(i==arr.length){
            return -1;
        }
        int isFound = LastOccurence(arr, key, i+1);//First look forward
        if(isFound == -1 && arr[i] == key){//then compare with self.
            return i;
        }
        return isFound;
    }
    public static int power(int x ,int n){//TC = O(N).
        if(n==0){
            return 1;
        }
        else{
            return x*power(x,n-1);
        }
    }
    public static int OptimizedPower(int x , int n){//TC = O(logn).
        if(n==0){
            return 1;
        }
        int HalfPower = OptimizedPower(x, n/2);
        int HalfPowerSq = HalfPower*HalfPower;
        //if n is odd.
        if(n % 2 != 0){
            HalfPowerSq = x*HalfPowerSq;
        }
        return HalfPowerSq;
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            printDec(n);
            System.out.println("-----------");
            printInc(n);
            System.out.println(Factorial(n));
            System.out.println(Sum(n));
            System.out.println(Fibonacci(n));
            int arr[] = new int[8];
            for(int i=0 ; i<arr.length ; i++){
                arr[i] = sc.nextInt();
            }
            System.out.println(isSorted(arr, 0));
            System.out.println(FirstOccurence(arr, 6, 0));
            System.out.println(LastOccurence(arr, 5 , 0));
            System.out.println(power(2, 4));
            System.out.println(OptimizedPower(2, 5));
        }
    }
    
}
