public class SubArrayPrefixSum {
    public static void MaxSum(int Numbers[]){//Time complexity = O(n^2).
        int CurrSum = 0;
        int MaxSum = Integer.MIN_VALUE;
        int Prefix[] = new int[Numbers.length];

        Prefix[0] = Numbers[0];
        //Calculate prefix array.
        for(int i=1 ; i<Prefix.length ; i++){
            Prefix[i] = Prefix[i-1] + Numbers[i];
        }
        for(int i=0 ; i<Numbers.length ; i++){
            int start = i;
            for(int j=i ; j<Numbers.length ; j++ ){
                int end = j ;
                CurrSum = start == 0 ? Prefix[end] : Prefix[end] - Prefix[start-1];
                if(MaxSum < CurrSum){
                    MaxSum = CurrSum;
                }
            }
        }
        System.out.println("Max Sum is : " + MaxSum);
    }
    public static void main(String args[]){
        int Numbers[] = {1,-2,6,-1,3};
        MaxSum(Numbers);
    }
    
}
