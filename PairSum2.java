import java.util.ArrayList;
public class PairSum2 {

    public static boolean PairSum(ArrayList<Integer> list , int target){//TC = O(n).
        int bp = -1;
        int n = list.size();
        for(int i=0 ; i<list.size() ; i++){
            if(list.get(i) > list.get(i+1)){//breaking point.
                bp = i;
                break;
            }
        }
        int lp = bp+1;//smallest element.
        int rp = bp;//largest element.

        while(lp != rp){
            //case 1
            if(list.get(lp) + list.get(rp) == target){
                return true;
            }
            //Case 2
            if(list.get(lp) + list.get(rp) < target){
                lp = (lp + 1) % n;
            }//Case 3
            else{
                rp = (n + rp -1) % n;
            }

        }
        return false;
    }

    public static void main(String args[]){
        ArrayList<Integer> List = new ArrayList<>();
        //11 , 15 , 6 , 8 , 9 , 10 - Sorted and Rotated,We have to find pivot element or breaking point.
        List.add(11);
        List.add(15);
        List.add(6);
        List.add(8);
        List.add(9);
        List.add(10);

        int target = 16;
        System.out.println(PairSum(List, target));
    }
    
}
