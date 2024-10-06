public class TilingProblem {
    public static int tilingProblem(int n){//(2*n).
        //base Case.
        if(n==0 || n==1){
            return 1;
        }

        //vertical choice.TIles of (2*1).
        int fnm1 = tilingProblem(n-1);

        //horizontal choice.
        int fnm2 = tilingProblem(n-2);

        int TotWays = fnm1 + fnm2;
        return TotWays;
    }

    public static void main(String args[]){
        System.out.println(tilingProblem(3));
    }
    
}
