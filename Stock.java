public class Stock {
    public static int MaxProfit(int Prices[]){//Time Complexity = O(n).
        int BuyPrice = Integer.MAX_VALUE;
        int Maxprofit = 0;
        for(int i=0 ; i<Prices.length ; i++){
            if(BuyPrice < Prices[i]){
                int Profit = Prices[i] - BuyPrice;//Today's Profit.
                Maxprofit = Math.max(Maxprofit , Profit);
            }
            else{
                BuyPrice = Prices[i];
            }
        }
        return Maxprofit;
    }
    public static void main(String args[]){
        int Prices[] = {7,1,5,3,6,4};
        System.out.println("MaxProfit is : " + MaxProfit(Prices));
    }
}
