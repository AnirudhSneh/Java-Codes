import java.util.*;
public class BitManipulation {
    public static void OddorEven(int n){
        int bitmask = 1;// Based on logic that for even number LSB is 0 and for odd number LSB is 1.
        if((n & bitmask) == 0){
            System.out.println("Even number");
        }
        else{
            System.out.println("Odd number");
        }
    }
    public static int GetIthbit(int n , int i){//[n & (1<<i)].
        int bitmask = 1<<i;
        if((n & bitmask) == 0){
            return 0;
        }
        else{
            return 1;
        }
    }
    public static int SetIthbit(int n , int i){//[n | (1<<i)].
        int bitmask = 1<<i;
        return n | bitmask;
    }
    public static int ClearIthbit(int n , int i){//[n & ~(1<<i)].
        int bitmask = ~(1<<i);
        return n & bitmask;
    }
    public static int UpdateIthbit(int n , int i , int NewBit){/*n = ClearIthbit(n,i); int bitmask = NewBit<<i;return n|bitmask; */
        if(NewBit == 0){
            return ClearIthbit(n,i);
        }
        else{
            return SetIthbit(n,i);
        }
    }
    public static int ClearLasiIthbits(int n , int i){// [n & (~0)<<i].
        int bitmask = (~0)<<i;
        return n & bitmask;
    }
    public static int ClearbitsinRange(int n , int i , int j){
        int a = (~0)<<(j+1);
        int b = (1<<i) - 1;
        int bitmask = a | b;
        return n & bitmask;
    }
    public static boolean IsPowerofTwo(int n){
        return ((n) & (n-1)) == 0;
    }
    public static int CountSetbits(int n){
        int count = 0;
        while(n > 0){
            if((n & 1) != 0){//Check LSB.
                count++;
            }
            n = n>>1;
        }
        return count;
    }
    public static int FastExpo(int a , int n){
        int ans = 1;
        while(n > 0){
            if((n & 1) != 0){//Check LSB.
                ans = ans * a;
            }
            a = a*a;
            n = n >> 1;
        }
        return ans;
    }
    public static void Swap(int x , int y){
        System.out.println("Before Swapping Values Are" + " x = " + x + " y = " + y);
        x = x^y;//x = x + y;
        y = x^y;//y = x - y;
        x = x^y;//x = x - y;
        System.out.println("After Swapping Values Are" + " x = " + x + " y = " + y);
    }
    
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
        System.out.println(5 & 6);//AND
        System.out.println(5 | 6);//OR
        System.out.println(5 ^ 6);//XOR
        System.out.println(~5);//NOT
        System.out.println(~0);
        System.out.println(~9);
        System.out.println(5<<2);//Binary left shift operator;Shift each bit to the left by two spaces if given (a<<b(2)).FORMULA-> [a << b] = [a * 2^b].
        System.out.println(6>>1);//Binary Right shift operator;Shift each bit of 6 to the right by 1 spaces. FORMULA -> [a >> b] = [a/2^b].

        int n = sc.nextInt();
        OddorEven(n);
        int i = sc.nextInt();
        System.out.println(GetIthbit(n, i));
        System.out.println(SetIthbit(n, i));
        System.out.println(ClearIthbit(n, i));
        int NewBit = sc.nextInt();
        System.out.println(UpdateIthbit(n, i, NewBit));
        System.out.println(ClearLasiIthbits(n,i));
        int j = sc.nextInt();
        System.out.println(ClearbitsinRange(n, i , j));
        System.out.println(IsPowerofTwo(n));
        System.out.println(CountSetbits(n));
        int a = sc.nextInt();
        System.out.println(FastExpo(a,n));
        Swap(5,4);
        }

    }
}
