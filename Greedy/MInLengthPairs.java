package Greedy;
import java.util.*;

public class MInLengthPairs {
    public static void main(String[] args) {//O(nlogn).
        int pairs[][] = {{5,24} , {39,60} , {5,28} , {27,40} ,{50,90}};

        Arrays.sort(pairs , Comparator.comparingDouble(o -> o[1]));

        int chainlen = 1;
        int chainEnd = pairs[0][1] ; //last selected pair end or chain end.

        for(int i=1 ; i<pairs.length; i++){
            if(pairs[i][0] > chainEnd){
                chainlen++;
                chainEnd = pairs[i][1];
            }
        }

        System.out.println("Chain Length " + chainlen);
    }
    
}
