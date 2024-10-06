public class SubArrayKadanes_Algo {//Time Complexity = O(n);
    public static void MaxSum(int Numbers[]){
        int CurrSum = 0;
        int MaxSum = Integer.MIN_VALUE;
        for(int i=0 ; i<Numbers.length ; i++){
            CurrSum = CurrSum + Numbers[i];
            if(CurrSum < 0){
                CurrSum = 0;
            }
            MaxSum = Math.max(CurrSum,MaxSum);
        }
        System.out.println("Max Sum is : " + MaxSum);
    }
    public static void main(String args[]){
        int Numbers[] = {-2,-3,4,-1,-2,1,5,-3};
        MaxSum(Numbers);
    }
    
}
