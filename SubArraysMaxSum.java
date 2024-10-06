public class SubArraysMaxSum {
    public static void MaxSum(int Numbers[]){//Time Complexity = O(n^3).->BRUTEFORCE.
        int CurrSum = 0;
        int MaxSum = Integer.MIN_VALUE;
        for(int i=0 ; i<Numbers.length ; i++){
            int start = i;
            for(int j=i ; j<Numbers.length ; j++){
                int end = j;
                CurrSum = 0;
                for(int k=start ; k<=end ; k++){
                    CurrSum += Numbers[k];
                }
                System.out.println(CurrSum);
                if(MaxSum<CurrSum){
                    MaxSum = CurrSum;
                }
            }
        }
        System.out.println("MaxSum = " + MaxSum);
    }
    public static void main(String args[]){
        int Numbers[] = {1,-2,6,-1,3};
        MaxSum(Numbers);
    }
}