import java.util.ArrayList;
public class CMW {
    public static int StoreWater(ArrayList<Integer> height){//BruteForce ; TC = O(n^2).
        int maxWater = 0;
        for(int i=0 ; i<height.size() ; i++){
            for(int j=i+1 ; j<height.size() ; j++){
                int ht = Math.min(height.get(i) , height.get(j));
                int width = j-i;
                int CurrWater = ht*width;
                maxWater = Math.max(maxWater,CurrWater);
            }
        }
        return maxWater;
    }
    public static int OptmStoreWater(ArrayList<Integer> height){//TC = O(n).
        int maxWater = 0;
        int lp= 0;
        int rp= height.size() -1;

        while(lp < rp){
            int ht = Math.min(height.get(lp) , height.get(rp));
            int width = rp - lp;
            int CurrWater = ht*width;
            maxWater = Math.max(maxWater,CurrWater);

            if(height.get(lp) < height.get(rp)){
                lp++;
            }
            else{
                rp--;
            }
        }
        return maxWater;
    }


    public static void main(String argss[]){
        ArrayList<Integer> Height = new ArrayList<>();
        Height.add(1);
        Height.add(8);
        Height.add(6);
        Height.add(2);
        Height.add(5);
        Height.add(4);
        Height.add(8);
        Height.add(3);
        Height.add(7);

        //System.out.println(StoreWater(Height));
        System.out.println(OptmStoreWater(Height));
    }
}
