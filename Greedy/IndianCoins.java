package Greedy;
import java.util.*;

public class IndianCoins {
    public static void main(String[] args) {
        Integer coins[] = {1,2,5,10,20,50,100,500,2000};

        Arrays.sort(coins , Comparator.reverseOrder());

        int CountofCoins = 0;
        int amount = 590;

        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=0 ; i<coins.length ; i++){
            if(coins[i] <= amount){
                while(coins[i] <= amount){
                    CountofCoins++;
                    ans.add(coins[i]);
                    amount -= coins[i];
                }
            }
        }
        System.out.println("Total Minimum Coins Used " + CountofCoins);


    }
}
