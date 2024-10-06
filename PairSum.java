import java.util.ArrayList;
public class PairSum {//Brute Force  TC = O(n^2).
    public static boolean PairSum1(ArrayList<Integer> list , int target){
        for(int i=0 ; i<list.size() ; i++){
            for(int j=i+1 ; j<list.size() ; j++){
                if(list.get(i) + list.get(j) == target){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean PairSum2(ArrayList<Integer> list , int target){//TC = O(n).
        int lp = 0;
        int rp = list.size()-1;

        while(lp != rp){
            //case1 
            if(list.get(lp) + list.get(rp) == target){
                return true;
            }
            //Case2
            if(list.get(lp) + list.get(rp) < target){
                lp++;
            }//Case3
            else{
                rp--;
            }
        }
        return false;
    }

    public static void main(String args[]){
        ArrayList<Integer> List = new ArrayList<>();

        //1 2 3 4 5 6 . This algo is used when an sorted array is given.
        List.add(1);
        List.add(2);
        List.add(3);
        List.add(4);
        List.add(5);
        List.add(6);

        int target = 5;
        //System.out.println(PairSum1(List, target));
        System.out.println(PairSum2(List,target));
    }
}
